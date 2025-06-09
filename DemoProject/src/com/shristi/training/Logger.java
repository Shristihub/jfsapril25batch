package com.shristi.training;

public class Logger {

	private static Logger logger;

	// private constructor
	private Logger() {
		System.out.println("inside constr");
	}

	// add a public static method that return ths logger object
	public static Logger createInstance() {
		// check if the instance is null
		if (logger == null)
			logger = new Logger();
		return logger;
	}
	
	public String logData() {
		return "data logged";
	}
}
