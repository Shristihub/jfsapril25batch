package com.shristi.inher;

public class Manager extends Employee{
	String department;

	public Manager(String employeeName, double salary, String department) {
		super(employeeName, salary);
		this.department = department;
	}

	void calcBonus(int amount) {
		System.out.println("Department "+department);
		System.out.println("Bonus "+(salary+amount));
	}

}