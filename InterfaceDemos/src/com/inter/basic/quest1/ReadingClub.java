package com.inter.basic.quest1;

public class ReadingClub implements IClub {

	@Override
	public void showActivities() {
		System.out.println("Reading sessions on weekends");
		System.out.println("Improve reading skills");

	}

	@Override
	public void printTariff(String type) {
		if(type.equals("online"))
			System.out.println("900 per hour");
		else if(type.equals("direct"))
			System.out.println("1600 per hour");
		else
			System.out.println("basic - 100 per hour");
	}

}
