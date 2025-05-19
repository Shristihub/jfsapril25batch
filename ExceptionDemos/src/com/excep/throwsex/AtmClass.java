package com.excep.throwsex;

public class AtmClass {

	public static void main(String[] args) {
		System.out.println("In ATM");
		Bank bank = new Bank();
		bank.withdraw(0);
	System.out.println("Amount withdrawn successfully");

	}
}
