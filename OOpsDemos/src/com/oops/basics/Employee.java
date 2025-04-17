package com.oops.basics;

public class Employee {
	
	int employeeId;
	double salary;
	String employeeName;
	
	
	public Employee( String employeeName,int employeeId, double salary) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.employeeName = employeeName;
	}

	void printDetails() {
		System.out.println("Name " + employeeName);
		System.out.println("Id " + employeeId);
		System.out.println("Salary " + salary);
	}
	
	void greetMessage(String message){
		System.out.println(message);
	}
	double calcBonus(double amount){
		double bonus = salary+amount;
		return bonus;
	}
}









