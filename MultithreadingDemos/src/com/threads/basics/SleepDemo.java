package com.threads.basics;

public class SleepDemo {

	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
//			1 *2= 2   2 *2= 4
		  System.out.println(i + " *2= "+(i*2));
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		  
		}
		
	}
}
