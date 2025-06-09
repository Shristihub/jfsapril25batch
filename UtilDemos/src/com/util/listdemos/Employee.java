package com.util.listdemos;

public class Employee implements Comparable<Employee>{
	private String empName;
	private String department;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, String department, double salary) {
		super();
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", department=" + department + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		//compare current object property with employee o property
//		return this.getEmpName().compareTo(o.getEmpName());
//		return this.getDepartment().compareTo(o.getDepartment());
		
		// autobox salary to Double
		Double nsalary = this.getSalary();
		return nsalary.compareTo(o.getSalary());
		
		
	}
	
	
}
