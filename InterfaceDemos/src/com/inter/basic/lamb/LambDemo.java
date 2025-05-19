package com.inter.basic.lamb;

public class LambDemo {

	public static void main(String[] args) {
		// implementation using lambda expression
		IGreeter ngreeter = ()->{
			System.out.println("Great Day");
		};
		//calling
		ngreeter.sayHello();
		
		IGreeter greeter = ()->System.out.println("welcome");
		greeter.sayHello();
	}

}
