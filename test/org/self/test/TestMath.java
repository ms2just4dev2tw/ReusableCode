package org.self.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMath {

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
	void testNearest() {
		double a = -0.2, b = -0.6, c = 0.3, d = 0.7;

		// ceil 是向上取整, 一般是大于或者等于参数, 沿着负无穷方向上取值
		// floor 是向下取整, 一般是小于或者等于参数, 沿着正无穷方向上取值
		// round 是四舍五入

		System.out.println("Math.ceil(-0.2) = " + Math.ceil(a));
		System.out.println("Math.floor(-0.2) = " + Math.floor(a));
		System.out.println("Math.round(-0.2) = " + Math.round(a));

		System.out.println("Math.ceil(-0.6) = " + Math.ceil(b));
		System.out.println("Math.floor(-0.6) = " + Math.floor(b));
		System.out.println("Math.round(-0.6) = " + Math.round(b));

		System.out.println("Math.ceil(0.3) = " + Math.ceil(c));
		System.out.println("Math.floor(0.3) = " + Math.floor(c));
		System.out.println("Math.round(0.3) = " + Math.round(c));

		System.out.println("Math.ceil(0.7) = " + Math.ceil(d));
		System.out.println("Math.floor(0.7) = " + Math.floor(d));
		System.out.println("Math.round(0.7) = " + Math.round(d));
	}

}
