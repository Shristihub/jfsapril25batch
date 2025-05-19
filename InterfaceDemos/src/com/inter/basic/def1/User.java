package com.inter.basic.def1;

public class User {

	public static void main(String[] args) {
		ILoanCalculator loanCalculator = new EmployeeDetails();
		loanCalculator.calculate(9000);
		loanCalculator.paymentDetails();
		
		IBonusCalculator bonusCalculator = new EmployeeDetails();
		bonusCalculator.calculate(12000);
		bonusCalculator.paymentDetails();
		
		// SHOULD BE called using interface ref
		IBonusCalculator.greet();
	}
}
