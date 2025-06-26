package com.shristi.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.shristi.training.Calculator;

class CalculatorTest {
	
	Calculator calculator = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		System.out.println("Called before all test cases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
//		System.out.println("Called after all test cases");
	}

	@BeforeEach
	void setUp() throws Exception {
//		System.out.println("for set up data");
		calculator = new Calculator();// set up data
	}

	@AfterEach
	void tearDown() throws Exception {
//		System.out.println("for removing data");
		calculator = null;
	}
	
	
	@Test
	@DisplayName("Testing sum")
	@Disabled
	void testSum() {
		int actual = calculator.sum(10, 20);
		int expected =30;
		assertEquals(expected, actual, "expected 30 but was different");
	}

	@Test
	@DisplayName("Testing Product")
	void testProduct() {
		int actual = calculator.product(2, 3);
		assertEquals(6, actual,"expected 6 but was different");
	}

}
