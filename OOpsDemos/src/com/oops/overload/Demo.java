package com.oops.overload;

public class Demo {

	public Demo() {
		this(10);
		System.out.println("Hello");
	}
	public Demo(int x) {
		this("Sri");
		System.out.println("Value "+x);
	}
	public Demo(String a) {
		System.out.println("Welcome "+a);
	}
	public static void main(String[] args) {
		Demo demo =new Demo();
	}

}
