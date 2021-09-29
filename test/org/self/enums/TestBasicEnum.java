package org.self.enums;

import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBasicEnum {

	static Basic basic;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		basic = new Basic();
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
	void testForeach() {
		basic.foreach(BasicEnum.class);
	}

	@Test
	void testEnumSwitch() {
		basic.enumSwitch(BasicEnum.HELLO);
	}

	@Test
	void testAnalyzeEnum() {
		Set<String> basicMethods = basic.analyzeEnum(BasicEnum.class);
		Set<String> enumMethods = basic.analyzeEnum(Enum.class);
		System.out.print("BasicEnum.containsAll(Enum) ? ");
		System.out.println(basicMethods.containsAll(enumMethods));
		System.out.print("BasicEnum.removeAll(Enum) : ");
		basicMethods.removeAll(enumMethods);
		System.out.println(basicMethods);
	}

	@Test
	void testRandomEnum() {
		basic.randomEnum(BasicEnum.class);
	}

}
