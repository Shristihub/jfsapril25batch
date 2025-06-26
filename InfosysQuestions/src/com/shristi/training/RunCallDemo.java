package com.shristi.training;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunCallDemo {

	public static void main(String[] args) {
		Runnable r = ()-> System.out.println("inside run method "+(10+20));
		
		Thread t = new Thread(r);
		t.start();
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.execute(r);
		
		Callable<Integer> c = ()->10+20;
		Future<Integer> future =  executor.submit(c);
		try {
			int val = future.get();
			System.out.println(val);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
