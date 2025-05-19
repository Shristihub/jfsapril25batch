package com.inter.basic.def;

public interface ISports {

	void showGames();
	
	default void academyDetails() {
		System.out.println("ABC Academy");
		System.out.println("Speciality in all types of sports");
	}
}
