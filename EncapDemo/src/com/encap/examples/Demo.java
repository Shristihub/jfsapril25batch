package com.encap.examples;

public class Demo {
	int a;// instance variables
	int b;
	private Demo() {
		
	}
	
	static int x =100;
	static int y;
	static {
		System.out.println("in static block 1");
		y=200;
		System.out.println("Sum "+(x+y));
	}
	static void sayHello(String name) {
		System.out.println("Hello "+name);
		
	}
//	public static void main(String[] args) {
//		sayHello("Priya");
//		
//		System.out.println("Product"+(x*y));
//	}

}
