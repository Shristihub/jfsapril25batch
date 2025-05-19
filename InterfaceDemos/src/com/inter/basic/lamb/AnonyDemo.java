package com.inter.basic.lamb;

public class AnonyDemo {

	public static void main(String[] args) {
	
		// anonymous class that implments the interface
		// implementation
		IGreeter ngreeter = new IGreeter() {
			@Override
			public void sayHello() {
				System.out.println("Hello class");
			}
			
		};
		//calling 
		ngreeter.sayHello();
		
		// implementation
		ngreeter = new IGreeter() {
					@Override
					public void sayHello() {
						System.out.println("great class");
					}
					
				};
				//calling 
				ngreeter.sayHello();
				
		
	}
}
