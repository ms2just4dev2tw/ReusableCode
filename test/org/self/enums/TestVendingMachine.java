package org.self.enums;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.self.enums.state.Generator;
import org.self.enums.state.Input;
import org.self.enums.state.RandomInputGenerator;
import org.self.enums.state.VendingMachine;

class TestVendingMachine {

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
		Generator<Input> gen = new RandomInputGenerator();
		gen = new RandomInputGenerator();
		VendingMachine.run(gen);
	}

}
