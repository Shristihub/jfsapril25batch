package com.oops.basics;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee("Raghu",1,1000);

		
		// print the details
		employee.printDetails();
		employee.greetMessage("Have a great day");
		double bonus =employee.calcBonus(2000);
		System.out.println("Bonus "+bonus);

		
		System.out.println();
		// follow the same process for another employee
		Employee employee1 = new Employee("Sri",2,8000);
		// assign values to the properties
		
		// print the details
		employee1.printDetails();
		employee1.greetMessage("Welcome");

System.out.println("Bonus "+employee1.calcBonus(2000));
		
		
		
		
		
		
		
		
		
	}
}
