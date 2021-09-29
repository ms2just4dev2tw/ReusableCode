package org.self;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadFile {

	public DownloadFile() {
	}

	/**
	 * 下载文件
	 * 
	 * @param source 源路径
	 * @param destination 目的路径
	 */
	public void download(String source, String destination) {
		// 输入流
		InputStream is = null;
		// 输出流
		OutputStream os = null;
		try {
			// 构造URL
			URL weburl = new URL(source);
			// 打开连接
			URLConnection con = weburl.openConnection();
			// 设置请求超时为5s
			con.setConnectTimeout(5000);

			is = con.getInputStream();
			os = new FileOutputStream(destination);

			// 1K的数据缓冲
			byte[] bs = new byte[1024];
			// 读取到的数据长度
			int len;

			// 开始读取
			while ((len = is.read(bs)) != -1)
				os.write(bs, 0, len);
			// 完毕，关闭所有链接
			os.close();
			is.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null)
					os.close();
				if (is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
