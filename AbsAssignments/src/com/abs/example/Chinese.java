package com.abs.example;

public class Chinese extends Cuisine {

	@Override
	void showItems() {
	 System.out.println("Starter: Rolls");
	 System.out.println("Main: Noodles");

	}

	@Override
	void dessertMenu() {
		System.out.println("panacotta");
		System.out.println("Rice pudding");

	}

}
