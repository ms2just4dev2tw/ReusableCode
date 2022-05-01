package org.self.net;

public final class PartConstant {

	// 每个下载文件开启的线程数目
	public final static int DEFAULT_THREAD_NUM = 3;

	// 下载文件和记录文件的默认存放位置, 没有考虑跨平台
	public final static String DEFAULT_DES_DIR = "D:\\Downloads";

	// 记录文件的后缀名
	public final static String SUFFIX_PART = "part";

	// 存入记录文件中的数据类型为 long 基本类型
	public final static int PART_STORE_BYTES = 8;

}
