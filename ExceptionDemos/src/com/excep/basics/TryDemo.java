package com.excep.basics;

public class TryDemo {

	public static void main(String[] args) {
		System.out.println(100.0/0);
//		try {
		System.out.println("Welcome");
		String value = args[0]; //"10"=> 10 "sri" XX exception
		System.out.println("Value got "+value);
		int num = Integer.parseInt(value);
		System.out.println("number "+num);
		int result = 100/0;
		System.out.println("Result "+result);
//		}catch(Exception e) {
//			System.out.println(e);
////			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		System.out.println("Work done");
		
	}
}
