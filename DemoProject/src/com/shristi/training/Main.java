package com.shristi.training;

public class Main {

	public static void main(String[] args) {
		// get an object / instance of logger
		Logger logger = Logger.createInstance();
		System.out.println(logger.logData());
		
		Logger logger1 = Logger.createInstance();
		System.out.println(logger1.logData());
		
		System.out.println(logger == logger1);
	
		
		
	}
}
