package org.self.net;

import static org.self.net.PartConstant.DEFAULT_DES_DIR;
import static org.self.net.PartConstant.DEFAULT_THREAD_NUM;
import static org.self.net.PartConstant.PART_STORE_BYTES;
import static org.self.net.PartConstant.SUFFIX_PART;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * 断点续传
 * 
 * @author TungWang
 */
public class PartialContent {

	// 要开启的线程数
	private int threadNum;
	// 已经下载的部分缓存标记
	private ArrayList<Long> downloadCache;
	// srcPath: 源文件(URI), desDir: 下载文件目录, resName: 资源名
	private String srcPath, desDir, resName;
	// contentLen: 要下载内容的总字节数, partLen: 单个线程要下载的字节数
	private long contentLen, partLen;

	public PartialContent(String srcPath) {
		this(srcPath, DEFAULT_DES_DIR, DEFAULT_THREAD_NUM);
	}

	public PartialContent(String srcPath, int threadNum) {
		this(srcPath, DEFAULT_DES_DIR, threadNum);
	}

	public PartialContent(String srcPath, String desDir) {
		this(srcPath, desDir, DEFAULT_THREAD_NUM);
	}

	public PartialContent(String srcPath, String desDir, int threadNum) {
		this.srcPath = srcPath;
		this.desDir = desDir;
		this.threadNum = threadNum;

		resName = srcPath.substring(srcPath.lastIndexOf('/'));
	}

	public void multiThreadDownload() {
		multiThreadDownload(DEFAULT_DES_DIR);
	}

	/**
	 * "file:///D:xxxx"
	 * 
	 * @param srcPath 传入的源路径以 '/' 作为分隔符, 由于要考虑 URL
	 * @param DesPath 目的路径的分隔符以目的系统为准
	 */
	public void multiThreadDownload(String DesDir) {
		//
		loadPartIfExist(srcPath);

		try {
			URL url = new URI(srcPath).toURL();

			URLConnection conn = url.openConnection();
			// 设置请求超时为 5s
			conn.setConnectTimeout(5000);
			//
			conn.setRequestProperty("Accept-Encoding", "identity");

			contentLen = conn.getContentLengthLong();
			partLen = (long) Math.ceil(contentLen / threadNum);

			for (int index = 0; index < threadNum; index++) {
				long start = downloadCache.get(index);
				long end = partLen * (index + 1);
				new Thread(new PartialTask(url, resName, index, start, end, desDir)).run();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void loadPartIfExist(String srcPath) {
		// 定位下载记录文件
		File partFile = new File(desDir + File.separatorChar + resName + '.' + SUFFIX_PART);

		RandomAccessFile partInput = null;
		try {
			// 如果记录文件存在, 就加载数据
			if (partFile.exists()) {
				partInput = new RandomAccessFile(partFile, "r");

				// threadNum 需要与之前的下载记录使用的线程数匹配
				long byteLen = partInput.length();
				this.threadNum = (int) (byteLen / PART_STORE_BYTES);
				downloadCache = new ArrayList<>(threadNum);

				// 加载缓存记录
				for (int i = 0; i < threadNum; i++)
					downloadCache.set(i, partInput.readLong());

				partInput.close();
			} else {
				downloadCache = new ArrayList<>(threadNum);
				downloadCache.forEach((val) -> val = 0L);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (partInput != null)
					partInput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
