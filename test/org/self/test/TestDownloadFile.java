package org.self.test;

import java.io.File;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.self.DownloadFile;

class TestDownloadFile {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int start = 1, end = 237;
		String suffix = "jpg";
		String srcParentPath = "";
		String dstParentPath = "";

		DownloadFile util = new DownloadFile();
		for (int index = start; index <= end; index++) {
			String fileName = index + "." + suffix;
			String src = srcParentPath + "/" + fileName;
			String dst = dstParentPath + File.separator + fileName;

			util.download(src, dst);

			System.out.println(src + "\t\t" + dst);
		}
	}

}
