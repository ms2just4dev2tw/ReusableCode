package org.self.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDouble {

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
		int validNumber = (1 << 24) - 1;
		System.out.println(validNumber);
		float max = (1 << 25) + 100;
		System.out.println(max);
		for (float f = validNumber; f < (1 << 23) + 100; f++)
			System.out.println(f);
	}

}
