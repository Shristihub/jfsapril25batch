package com.threads.run;

public class Trainer {

	public void explain(String name,String question) {
		System.out.println("Hi "+name+" Ask your question");
		System.out.println(name+" :question is "+ question);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("This is your answer "+name);
		
	}
}
