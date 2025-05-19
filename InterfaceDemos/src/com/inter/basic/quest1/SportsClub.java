package com.inter.basic.quest1;

public abstract class SportsClub implements IClub {

	
	@Override
	public void printTariff(String type) {
		if(type.equals("in"))
			System.out.println("Monthly fee - 1000");
		else
		  System.out.println("Montly fee - 1500");
		
	}
	

}
