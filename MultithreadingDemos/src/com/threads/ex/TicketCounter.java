package com.threads.ex;

public class TicketCounter extends Thread {
	private String name;
	private int priority;
	private int noOfTickets;
	private Booking booking;

	public TicketCounter(String name, int priority, int noOfTickets, Booking booking) {
		this.name = name;
		this.priority = priority;
		this.noOfTickets = noOfTickets;
		this.booking = booking;
		this.start();
		System.out.println(name + " is ready");
	}  

	@Override
	public void run() {

		// call the method
		synchronized (booking) {
			System.out.println("Ticket booking for " + name);
			double amount = booking.bookTickets(name, noOfTickets);
			System.out.println("Booked successfully for: " + name + "\nTotalAmount:" + amount);
		}
	}

}
