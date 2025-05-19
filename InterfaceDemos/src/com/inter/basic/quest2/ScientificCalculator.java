package com.inter.basic.quest2;

public class ScientificCalculator extends BasicCalculator implements Scientific{


	@Override
	public void square(int x) {
       System.out.println("Sq"+Math.pow(x, 2));		
	}

	@Override
	public void cube(int x) {
		System.out.println("Cube"+Math.pow(x, 3));				
	}

}
