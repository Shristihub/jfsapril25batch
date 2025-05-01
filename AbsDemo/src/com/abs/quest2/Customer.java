package com.abs.quest2;

public class Customer {

	public static void main(String[] args) {
		Bank bank =  new Branch1();
		bank.carLoan();
		bank.housingLoan();
		bank.eduLoan();
		bank.adminDetails();
		
//		Branch1 branch1 = new Branch1(); //this is wrong
		
		Branch1 branch1 = (Branch1) bank;
		branch1.loanPayment();// ownmethod

	}

}
