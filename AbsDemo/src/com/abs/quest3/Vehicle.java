package com.abs.quest3;

public abstract class Vehicle {
	
	final String showRoomName= "Josephs Showroom"; 

	String brand;
	String model;
	public Vehicle(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	abstract void showAccessories();
	abstract void getMileage();
	
	//normal or concrete method
	void printDetails() {
		System.out.println("Brand"+brand);
		System.out.println("Model"+model);
	}
	
	final void showRoomDetails() {
		System.out.println("Luxury Cars for you");
		System.out.println("Sports Bikes and Accessories");
		showBranches();
	}
	
	private void showBranches() {
		System.out.println("branches in many places");
	}
	
}





