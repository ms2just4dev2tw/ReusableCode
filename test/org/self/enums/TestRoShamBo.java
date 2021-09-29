package org.self.enums;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.self.enums.multiple.PlayRoShamBo;
import org.self.enums.multiple.RoShamBo1;
import org.self.enums.multiple.RoShamBo2;
import org.self.enums.multiple.RoShamBo3;
import org.self.enums.multiple.RoShamBo4;

class TestRoShamBo {

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
	void testRoShamBo1() {
		System.out.println("RoShamBo1=============");
		new PlayRoShamBo().play(RoShamBo1.class, 20);
		System.out.println("=====================");
	}

	@Test
	void testRoShamBo2() {
		System.out.println("RoShamBo2=============");
		new PlayRoShamBo().play(RoShamBo2.class, 20);
		System.out.println("=====================");
	}

	@Test
	void testRoShamBo3() {
		System.out.println("RoShamBo3=============");
		new PlayRoShamBo().play(RoShamBo3.class, 20);
		System.out.println("=====================");
	}

	@Test
	void testRoShamBo4() {
		System.out.println("RoShamBo4=============");
		new PlayRoShamBo().play(RoShamBo4.class, 20);
		System.out.println("=====================");
	}

}
