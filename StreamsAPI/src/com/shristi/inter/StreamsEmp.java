package com.shristi.inter;

import java.util.Arrays;
import java.util.List;


public class StreamsEmp {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Priya", "Manager", 10000,"Bangalore"),
				new Employee("Arav", "Manager", 21000,"Pune"), 
				new Employee("Kathy", "Developer", 12000,"Bangalore"),
				new Employee("David", "Manager", 42000,"Bangalore"), 
				new Employee("Monu", "Manager", 28000,"Chennai"),
				new Employee("Raju", "Manager", 10000,"Bangalore"),
				new Employee("Jo", "Manager", 21000,"Pune"), 
				new Employee("Ram", "Developer", 12000,"Bangalore"),
				new Employee("Bhanu", "Manager", 42000,"Bangalore"), 
				new Employee("Rakesh", "Manager", 28000,"Chennai")
				
				);
	
	System.out.println("get by city");
	employees.stream()
			.filter(emp->emp.getCity().equals("Bangalore"))
			.filter(emp->emp.getDesignation().equals("Manager"))
			.map(emp->emp.getSalary())
			.sorted()
//			.limit(2)
			.forEach(emp->System.out.println(emp));
	
	
	
	
	
	
	
	}
	
	
}
