package com.shristi.training;

public class OverMain {

	public static void main(String[] args) {
		// super class ref = sub class object
		Shape shape = new Rectangle(); // shape ref points to Rectangle
		shape.area(10, 20);
		
		Shape shape1 = new Triangle(); //shape ref points to triangle
		shape1.area(8, 9);
		
	
	}
}
