package com.oops.overload;

public class Shape {

	void area(int x) {
		System.out.println("Sq "+(x*x));
	}
	void area(double x) {
		System.out.println("Circle"+Math.PI*x*x);
	}
	
	int area(int x,int y) {
		return x*y;
	}
	float area(int x, float y) {
       return (float)0.5*x*y;
	}
}
