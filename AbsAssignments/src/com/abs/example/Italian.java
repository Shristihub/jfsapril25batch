package com.abs.example;

public class Italian extends Cuisine {

	@Override
	void showItems() {
	 System.out.println("Starter: Soups");
	 System.out.println("Main: Pasta");

	}

	@Override
	void dessertMenu() {
		System.out.println("truffles");
		System.out.println("tiramisu");

	}

}
