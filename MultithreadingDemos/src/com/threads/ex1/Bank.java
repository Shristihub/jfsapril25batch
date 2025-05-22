package com.threads.ex1;

class Customer extends Thread {
	private String name;
	private double amount;
	private LoanDepartment executive;

	public Customer(String name, double amount, LoanDepartment executive) {
		super(name);
		this.name = name;
		this.amount = amount;
		this.executive = executive; // initialize
		System.out.println(this);
		this.start(); // be ready threads are in pool
	}

	@Override
	public void run() {
		// cpu
		// only one executive available now
		// synchronize the object
		synchronized (executive) {
			System.out.println(Thread.currentThread().getName() + "....");
			System.out.println("Hello " + name);
			executive.sanctionLoan(name, amount);
			System.out.println("You loan is sanctioned " + name);
		}
	}

}

public class Bank {
	public static void main(String[] args) {
		LoanDepartment executive = new LoanDepartment();
		Customer token1 = new Customer("Raju", 100000, executive);
		Customer token2 = new Customer("Anna", 50000, executive);
		Customer token3 = new Customer("John", 150000, executive);

	}

}
