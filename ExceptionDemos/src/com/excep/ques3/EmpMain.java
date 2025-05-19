package com.excep.ques3;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("welcome");
		try {
			employee.checkName("SKumaran");
			System.out.println("Registered");
		} catch (NameNotFoundException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Done");
	}
}
