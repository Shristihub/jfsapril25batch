package com.shristi.training;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunCallDemo {

	public static void main(String[] args) {
		//Using Runnable
		Thread th  = new Thread(()->System.out.println("hello"), "Thread1");
		th.start();
				
		ExecutorService exService = Executors.newFixedThreadPool(10);
		exService.execute(()->System.out.println("Welcome"));
		
		Future<String> future =  exService.submit(()->"Have a great day");
		try {
			String result = future.get();
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
