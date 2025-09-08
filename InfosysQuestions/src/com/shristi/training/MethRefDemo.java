package com.shristi.training;


interface Greeter{
	void sayHello(String username);
}
interface Calculator{
	int sum(int x, int y);
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
		//refering to a static method of a different class
		Greeter greet = StudentDetails::greetUser;
		//call
		greet.sayHello("Priya");
		
		//refering to a instance method of a different class
		StudentDetails studentDetails =  new StudentDetails();
		//implementation
		Calculator calc = studentDetails::totalMarks;
		//call
		System.out.println(calc.sum(20, 30));
		
		
		
		
		
	}
}




