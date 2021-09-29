package org.self.enums;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.self.enums.TableDriven.Command;

class TestTableDriven {

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
		TableDriven driver = new TableDriven();
		driver.command(Command.COPY);
		driver.command(Command.CUT);
		driver.command(Command.DELETE);
		driver.command(Command.INSERT);
		driver.command(Command.PASTE);
	}

}
