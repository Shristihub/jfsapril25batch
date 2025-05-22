package com.threads.basics;

class Exthread extends Thread {
	public Exthread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + (i * 5));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class DaemonDemo {

	public static void main(String[] args) {
		Exthread thread1 = new Exthread("Poll");
		thread1.setDaemon(true);
		thread1.start();
		
		Thread cthread = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Running Jobs " + (i * 2));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}
