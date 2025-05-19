package com.inter.basic.quest1;

public class User {
	public static void main(String[] args) {

		// interface reference = implementation class object
		IClub club = new ReadingClub();
		club.showActivities();
		club.printTariff("direct");
		// print the variable = interface name. variable name
		System.out.println(IClub.CLUBNAME);

		club = new IndoorClub();
		club.showActivities();
		club.printTariff("in");
		System.out.println(IClub.CLUBNAME);

		club = new OutdoorClub();
		club.showActivities();
		club.printTariff("out");
		
		
		club = new Sketching();
		club.showActivities();
		club.printTariff("advance");
		club = new Painting();
		club.showActivities();
		club.printTariff("brush");

	}

}
