package com.inter.basic.def1;

public interface ILoanCalculator {
	
	void calculate(int amount);
	default void paymentDetails() {
		System.out.println("Varies based on cadre");
	}

}
