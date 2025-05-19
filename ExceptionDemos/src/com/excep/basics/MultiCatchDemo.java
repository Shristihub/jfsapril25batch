package com.excep.basics;

public class MultiCatchDemo {

	public static void main(String[] args) {
		try {
		System.out.println("Welcome");
		String value = args[0]; //"10"=> 10 "sri" XX exception
		System.out.println("Value got "+value);
		int num = Integer.parseInt(value);
		System.out.println("number "+num);
		int result = 100/num;
		System.out.println("Result "+result);
		int nums[] = null;
		System.out.println(nums[1]); //NullPointerException
		}catch(ArithmeticException |NumberFormatException | 
				NullPointerException e) {
			System.out.println(" enter proper value");
		}catch(RuntimeException e) {
			System.out.println(e);
			System.out.println("other exception");
		}catch(Exception e) {
			System.out.println("new exceptions");
		}
		System.out.println("Work done");
		
	}
}
