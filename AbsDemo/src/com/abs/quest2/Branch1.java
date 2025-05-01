package com.abs.quest2;

public class Branch1 extends Bank{

	@Override
	void carLoan() {
		System.out.println("car loan @12%");
	}

	@Override
	void housingLoan() {
		System.out.println("housing loan @8%");
		
	}

	@Override
	void eduLoan() {
		System.out.println("edu loan @5%");
		
	}
	//override
	@Override
	void adminDetails() {
		System.out.println("admin details in branch1");
	}
	
	
	
	// own method
	void loanPayment() {
		System.out.println("Pay loans");
	}

	

}
