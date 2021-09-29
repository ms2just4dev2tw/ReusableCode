package org.self.test;

import java.io.File;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.self.RenameFile;

class TestRenameFile {

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
	void renameWithStart() {
		int start = 358;
		String path = "D:/Videos/[シュート・ザ・ムーン (フエタキシ)] 冬虫夏草8〜親友の姉妹を貪る夏〜最終章 [中国翻訳] [DL版]";
		new RenameFile(start, path).rename();
	}

	void renmaeWithStartandEnd() {

	}

	void getAbsolutePath() {
		System.out.println(RenameFile.class.getResource(""));
	}

	void testSeparator() {
		// 与系统有关的默认名称分隔符
		System.out.println(File.separator);
		// 与系统有关的路径分隔符
		System.out.println(File.pathSeparator);
	}

}
