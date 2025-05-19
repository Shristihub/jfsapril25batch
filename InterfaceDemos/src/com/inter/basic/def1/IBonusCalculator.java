package com.inter.basic.def1;

public interface IBonusCalculator {
	// SHOULD be overridden
	void calculate(int amount);
	// can be overriden
	default void paymentDetails() {
		System.out.println("Varies based on cadre");
	}
	//called using interface name
	static void greet() {
		System.out.println("welcome to spring");
	}

}
