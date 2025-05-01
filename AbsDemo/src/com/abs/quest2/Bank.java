package com.abs.quest2;

public abstract class Bank {
	abstract void carLoan();

	abstract void housingLoan();

	abstract void eduLoan();

	void adminDetails() {
		System.out.println("admin");
	}

}
