package com.shristi.inher;

public class InherMain {
	public static void main(String[] args) {
		Employee employee= new Employee("Priya",1000);
		employee.printDetails();
		
		Manager manager = new Manager("Sri",2000,"Admin");
		manager.printDetails();
		manager.calcBonus(1000);
		
		
		
	}

}
