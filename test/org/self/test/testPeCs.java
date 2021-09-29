package org.self.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.self.PeCs.MyStack;

class testPeCs {

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
		// 初始化数据
		List<Integer> list = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		Iterable<Integer> ints = list;
		MyStack<Number> numberStack = new MyStack<>();

		// 开始测试
		// numberStack.pushAll_My(ints);
		numberStack.pushAll_My_E(ints);

		Collection<Object> dst = new ArrayList<>();
		// numberStack.popAll_My(dst);
		numberStack.popAll_My_S(dst);
	}

}
