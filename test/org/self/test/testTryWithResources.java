package org.self.test;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.self.TryWithResources;

class testTryWithResources {

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

	void testTryFinallyOnResources() {
		TryWithResources way = new TryWithResources();
		try {
			way.tryFinallyOnResources();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void testTryFinallyOnMultipleResources() {
		TryWithResources way = new TryWithResources();
		try {
			way.tryFinallyOnMultipleResources();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testTryWithResourcesOnResources() {
		TryWithResources way = new TryWithResources();
		try {
			way.TryWithResourcesOnResources();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void testTryWithResourcesOnMultipleResources() {
		TryWithResources way = new TryWithResources();
		try {
			way.TryWithResourcesOnMultipleResources();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
