package org.self.net;

import static org.self.net.PartConstant.DEFAULT_DES_DIR;
import static org.self.net.PartConstant.PART_STORE_BYTES;
import static org.self.net.PartConstant.SUFFIX_PART;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;

public class PartialTask implements Runnable {

	private URL url;
	// dstPath: 下载文件的存放路径, partPath: part 记录文件的路径
	private String dstPath, partPath;
	// partIndex:下载任务的 part 标记(以 0 开始)
	private int partIndex;
	//
	private long start, end;

	public PartialTask(URL url, String resName, int partIndex, long start, long end) {
		this(url, resName, partIndex, start, end, DEFAULT_DES_DIR);
	}

	public PartialTask(URL url, String resName, int partIndex, long start, long end, String desDir) {
		this.url = url;
		this.partIndex = partIndex;
		this.start = start;
		this.end = end;

		dstPath = desDir + File.separator + resName;
		partPath = desDir + File.separator + resName + '.' + SUFFIX_PART;
	}

	@Override
	public void run() {
		// 输入流
		InputStream is = null;
		// 输出流
		RandomAccessFile rdf = null;
		// 记录输出流
		RandomAccessFile partWrite = null;
		try {
			URLConnection conn = url.openConnection();
			// 设置请求超时为 5s
			conn.setConnectTimeout(5000);
			//
			conn.setRequestProperty("Accept-Encoding", "identity");
			//
			conn.setRequestProperty("RANGE", "bytes=200000");

			int bufLen = 1024, redLen = -1, writeLen = 0;
			byte buf[] = new byte[bufLen];
			is = conn.getInputStream();

			// 写入流
			rdf = new RandomAccessFile(dstPath, "rw");
			rdf.seek(start);
			// 记录流
			partWrite = new RandomAccessFile(partPath, "rw");

			// 开始读取
			while (redLen < end && (redLen = is.read(buf)) != -1) {
				rdf.write(buf, 0, redLen);
				writeLen += redLen;
				// 再每次写入记录前需要重新定位
				partWrite.seek(partIndex * PART_STORE_BYTES);
				partWrite.writeLong(writeLen);
			}

			is.close();
			rdf.close();
			partWrite.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
				if (rdf != null)
					rdf.close();
				if (partWrite != null)
					partWrite.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
