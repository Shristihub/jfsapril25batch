package com.shristi.training;

interface Calculator{
	int sum(int x, int y);
}
interface Greeter{
	void sayHello(String username);
}

class StudentDetails{
	 int totalMarks(int m1, int m2) {
		System.out.println("Total "+(m1+m2));
		return m1+m2;
	}
	static void greetUser(String name) {
		System.out.println("Welcome "+name);
	}
}

public class MethRefDemo {

	public static void main(String[] args) {
	
		
	}
}
