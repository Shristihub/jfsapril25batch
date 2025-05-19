package com.threads.ex;

class Child extends Thread {
	String threadName;
	int priority;

	public Child(String threadName, int priority) {
		super();
		this.threadName = threadName;
		this.priority = priority;
		this.start();
		System.out.println(this); // prints the current thread
	}
	@Override
	public void run() {
		Thread cthread = Thread.currentThread();
		System.out.println(cthread.getName()+" entered");
		// this is the CPU
		// call other class methods or business logic
		for (int i = 1; i <= 10; i++) {
			System.out.println(cthread.getName()+" is occupying CPU");
			System.out.println(i + " *5= " + (i * 5));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}}}

public class ExtendMain {
	public static void main(String[] args) {
		Child thread1 = new Child("Thread-1", 1);
		Child thread2 = new Child("Thread-2", 1);
		Thread cthread = Thread.currentThread();
		System.out.println(cthread.getName()+" entered");
		for (int i = 1; i <= 10; i++) {
			System.out.println(cthread.getName()+" is occupying CPU");
			System.out.println("Hello " + (i * 2));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
		
		

	}

}
