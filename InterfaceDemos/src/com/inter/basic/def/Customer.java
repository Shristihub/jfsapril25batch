package com.inter.basic.def;

public class Customer {

	public static void main(String[] args) {
		
		ISports sports = new Indoor();
		sports.showGames();
		sports.academyDetails();
		
		System.out.println();
		sports = new Outdoor();
		sports.showGames();
		sports.academyDetails();
	}
}
