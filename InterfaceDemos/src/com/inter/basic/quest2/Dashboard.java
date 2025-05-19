package com.inter.basic.quest2;

public class Dashboard {
	public static void main(String[] args) {
		Calculator calculator =  new BasicCalculator(); 
		calculator.sum(10,20);
		calculator.product(1, 10);
		
		calculator =  new ScientificCalculator();
		calculator.sum(10, 10);
		calculator.product(1, 20);
		
		Scientific scientific =(Scientific) calculator;
		scientific.sum(1, 20);
		scientific.square(20);
		
		
		
	}

}
