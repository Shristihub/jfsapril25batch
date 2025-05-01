package com.abs.quest3;

public class Bike extends Vehicle{
	String accessory;

	public Bike(String brand, String model, String accessory) {
		super(brand, model);
		this.accessory = accessory;
	}

	@Override
	void showAccessories() {
		System.out.println("Helmet "+accessory);
	}
	@Override
	void getMileage() {
		System.out.println("Okish");
		
	}
	String[]  showBikeTypes() {
//		String[] biketypes = {"terrain","sports","normal"};
//		return biketypes;
		
		return new String[] {"terrain","sports","normal"};
		
	}
	
	

}
