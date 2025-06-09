package com.util.listdemos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareDemo {

	public static void main(String[] args) {
		//diffe between List.of and Arrays.asList
		
		
		List<Employee> employees = Arrays.asList(
				new Employee("Priya", "Admin", 10000),
				new Employee("Arav", "Marketing", 21000), 
				new Employee("Kathy", "Admin", 12000),
				new Employee("David", "Research", 42000), 
				new Employee("Monu", "Admin", 28000));
		System.out.println("Before sorting");
		for (Employee employee : employees)
			System.out.println(employee);
		
		Collections.sort(employees);
		System.out.println();
		System.out.println("After sorting");
		for (Employee employee : employees)
			System.out.println(employee);
		

	}
}
