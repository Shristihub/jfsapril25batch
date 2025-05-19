package com.inter.basic.quest2;

public class BasicCalculator implements Calculator{

	@Override
	public void sum(int x, int y) {
		System.out.println("Sum "+(x+y));
	}

	@Override
	public void product(int x, int y) {
		System.out.println("Product"+(x*y));
	}

}
