package com.inter.basic.def;

public class Indoor implements ISports{

	@Override
	public void showGames() {
		System.out.println("Chess,Shooting");
	}

	@Override
	public void academyDetails() {
		ISports.super.academyDetails();
		System.out.println("Experienced Coaches");
		System.out.println("Clean and neat facility");
	}
	

}
