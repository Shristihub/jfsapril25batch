package com.excep.throwsex;

public class Bank {

	int balance;

	void withdraw(int amount) {
		System.out.println("********");
		System.out.println("In Bank ");
		try {
			balance = 1000 / 0;
			System.out.println("Bal " + balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new ArithmeticException();
		} finally {
			System.out.println("close db");
		}
		System.out.println("Server done");
		System.out.println("--------------");
	}
}
