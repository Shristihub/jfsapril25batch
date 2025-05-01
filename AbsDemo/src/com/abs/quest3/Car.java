package com.abs.quest3;

public class Car extends Vehicle {
	double price;
	

	public Car(String brand, String model, double price) {
		super(brand, model);
		this.price = price;
	}

	@Override
	void showAccessories() {
		System.out.println("music system, car cover");
	}

	@Override
	void getMileage() {
		System.out.println("Good");
	}
	
	void printFeatures() {
		System.out.println("6 seater");
		System.out.println("SUV");
		System.out.println("Rear Ac attached");
		
	}

}




