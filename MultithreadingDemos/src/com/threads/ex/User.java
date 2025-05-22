package com.threads.ex;

public class User {

	public static void main(String[] args) {
		Booking booking = new Booking();
		TicketCounter counter1 = new TicketCounter("Ram",Thread.MIN_PRIORITY,10,booking);
		TicketCounter counter2 = new TicketCounter("John",Thread.NORM_PRIORITY-2,3,booking);
		TicketCounter counter3 = new TicketCounter("David",Thread.MAX_PRIORITY-2,5,booking);
		
	}

}
