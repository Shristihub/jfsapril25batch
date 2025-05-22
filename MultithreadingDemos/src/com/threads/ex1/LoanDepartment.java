package com.threads.ex1;

public class LoanDepartment {

	public void sanctionLoan(String name, double amount) {
		System.out.println("welcome "+name);
		System.out.println("Check your documents....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(amount +" amount loan sanctioned to "+name);
		System.out.println("Have a great day "+name);
		
		 
	}
}
