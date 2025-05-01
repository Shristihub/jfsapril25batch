package com.shristi.training;

public class Rectangle extends Shape{

	@Override
	void area(int x, int y) {
	  System.out.println("Rect "+(x*y));
	  super.area(x, y); //calling the method of the super class
	}


	


}
