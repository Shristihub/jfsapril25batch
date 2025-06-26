package com.shristi.training;

import com.shristi.exceptions.ExceedingLimitsException;
import com.shristi.exceptions.OutOfLimitsException;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	public double withdraw(double amount) throws ExceedingLimitsException {
		if (amount >= 3000) {
			throw new ExceedingLimitsException("excceeding the limit");
		}
		balance -= amount;
		return balance;
	}

	public double deposit(double amount) throws OutOfLimitsException {
		if (amount > 10000)
			throw new OutOfLimitsException("out of limits");
		balance += amount;
		return balance;
	}
}
