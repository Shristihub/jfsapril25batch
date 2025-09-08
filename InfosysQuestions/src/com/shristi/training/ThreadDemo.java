package com.shristi.training;

class TaskOne implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello ");
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {
		//using a class
		Thread th =  new Thread(new TaskOne(),"Thread1");
		//using lambda
		Runnable runn = ()->System.out.println("Welcome");
		Thread th1 = new Thread(runn,"Thread2");
		
		//using lambda
		Thread th2 = new Thread(()->System.out.println("Great day"),"Thread3");
		th.start();
		th1.start();
		th2.start();
		
		
	}
}












