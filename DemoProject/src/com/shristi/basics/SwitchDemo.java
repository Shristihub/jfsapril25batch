package com.shristi.basics;

public class SwitchDemo {
	public static void main(String[] args) {
		int x = 100;
		int y = 20;
		
		// use has to provide input
		String choice = "DiV";
		switch (choice.toUpperCase()) {
		case "ADD":
			System.out.println("Sum " + (x + y));
			break;
		case "DIFF":
			System.out.println("Diff " + (x - y));
			break;
		case "PROD":
			System.out.println("Prod " + (x * y));
			break;
		case "DIV":
			System.out.println("Div " + (x / y));
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}

