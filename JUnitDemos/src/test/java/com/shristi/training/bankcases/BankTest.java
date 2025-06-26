package com.shristi.training.bankcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.shristi.exceptions.ExceedingLimitsException;
import com.shristi.exceptions.OutOfLimitsException;
import com.shristi.training.Bank;

class BankTest {
	
	Bank bank;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		//create a bank object - set up data
		bank = new Bank(8000);
	}

	@AfterEach
	void tearDown() throws Exception {
		bank = null;
	}

	@Test
	@DisplayName("Testing withdraw - positive")
	void testWithdraw() throws ExceedingLimitsException{
		double actual = bank.withdraw(1000);
		assertEquals(7000, actual,0.5,"expected 7000 but was diff");
	}
	
	@Test
	@DisplayName("Testing withdraw - negative")
	void testLimitWithdraw() {
//		double actual = bank.withdraw(3000);
		assertThrows(ExceedingLimitsException.class,()->{
			bank.withdraw(3000);
		});
		
	}
	@Test
	@DisplayName("Testing deposit - positive")
	void testDeposit()throws OutOfLimitsException {
		double actual = bank.deposit(2000);
		assertEquals(10000, actual,0.5,"expected 10000 but was diff");
	
	}
	
	@Test
	@DisplayName("Testing deposit - neg")
	void testOverDeposit() {
		assertThrows(OutOfLimitsException.class,()->bank.deposit(12000));
	}

}
