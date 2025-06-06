package com.oops.overload;

public class Vehicle {
	String model;
	String brand;
	double price;
	public Vehicle() {
		//super() will added automatically
		System.out.println("No ARgs");
	}
	public Vehicle(String model) {
		this();
		System.out.println("one args");
		this.model = model;
	}
	public Vehicle(String model, double price) {
		this(model);
		System.out.println("2 args");
		this.price = price;
	}
	
	public Vehicle(String model, String brand, double price) {
		this(model,price);
		System.out.println("3 args");
		this.brand = brand;
	}
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Rx!00","Bajaj",90000);
	}
}
