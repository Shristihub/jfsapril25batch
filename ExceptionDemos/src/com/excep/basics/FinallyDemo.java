package com.excep.basics;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Hello");
			int result = 100 / 0;
			System.out.println("Result " + result);
		} 
//		catch (Exception e) {
//			System.out.println(e);
//			System.out.println(e.getMessage());
//		}
		finally {
			System.out.println("close db");
		}
		System.out.println("Work done");

	}
}
