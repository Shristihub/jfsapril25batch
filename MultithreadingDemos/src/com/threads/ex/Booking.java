package com.threads.ex;

public class Booking {
	int totalTickets = 100;
	double price =320;
	public double bookTickets(String name, int noOfTickets) {
		System.out.println("Welcome "+name);
		double total = price* noOfTickets;
		System.out.println("Total amount for "+name+" is "+total);
		return total;
		
	}

}
