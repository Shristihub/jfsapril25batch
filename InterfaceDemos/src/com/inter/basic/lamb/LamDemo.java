package com.inter.basic.lamb;

import java.util.function.Predicate;

public class LamDemo {
	public static void main(String[] args) {
		System.out.println("Sum of numbers");
		ICalculatorr ref = (int x, int y)->{
			System.out.println("Sum "+(x+y));
		};
		//call
		ref.calculate(10, 20);
		
		ref = (x,y)->System.out.println("Product "+(x*y));
		ref.calculate(1, 20);
		
		ref = (x,y)->System.out.println("Diff "+(x-y));
		ref.calculate(100, 20);
		
		
		
		
		
		
	}

}
