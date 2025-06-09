package com.shristi.inter;

public class Employee {
	private String empName;
	private String designation;
	private double salary;
	private String city;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee(String empName, String designation, double salary, String city) {
		super();
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	}
	
	
