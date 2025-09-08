package com.shristi.training;

//singleton
public class BonusDetails {
	
	private static BonusDetails instance  = new BonusDetails();

	private BonusDetails() {
		System.out.println("inside constr");
	}
	
	//public static method
	public static BonusDetails createInstance() {
		synchronized (instance) {
		 
		 if(instance== null)
		  	instance = new BonusDetails();
		}
		 return instance;
		
	}
	

}
