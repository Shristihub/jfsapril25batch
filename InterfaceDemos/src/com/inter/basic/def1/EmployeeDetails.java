package com.inter.basic.def1;

public class EmployeeDetails implements ILoanCalculator,IBonusCalculator{

	@Override
	public void calculate(int amount) {
		System.out.println("Calculating loan and bonus for "+amount);
		
	}

	@Override
	public void paymentDetails() {
		System.out.println("Payment for all loans");
		
	}
	

}
