package org.self;

import java.io.File;

public class RenameFile {

	private int start; // 起始文件名，不带后缀
	private String directory; // 文件目录

	public RenameFile(int start, String directory) {
		this.directory = directory;
	}

	public void rename() {
		File path = new File(directory);
		// list() 返回当前路径下所有的文件和目录
		for (String s : path.list()) {
			System.out.println();
			File file = new File(directory + File.separator + s);
			work(file);
		}
	}

	// 控制在文件目录中改名的文件范围
	public void rename(int end) {
		for (int i = start; i <= end; i++) {
			String name = i + ".jpg";
			File file = new File(directory + File.separator + name);
			work(file);
		}
	}

	private void work(File file) {
		if (file.isFile()) {
			// 获取文件的原始名称
			String name = file.getName();
			// 获取最后一个.的位置
			int lastIndexOf = name.lastIndexOf(".");
			// 获取文件的前缀名
			String prefix = name.substring(0, lastIndexOf);
			// 获取文件的后缀名，这个带有分隔符
			String suffix = name.substring(lastIndexOf);

			String newPrefix = String.valueOf(Integer.parseInt(prefix) + start);
			String newName = newPrefix + suffix;

			System.out.print(name + "    " + prefix + "    " + lastIndexOf + "    " + suffix);
			System.out.print("    " + newPrefix + "    " + newName);
			System.out.println();

			// 改名
			file.renameTo(new File(directory + File.separator + newName));
		}
	}

}
