package com.shristi.meth;

public class RefMethDemo {

	public static void main(String[] args) {
		//lambda
		IGreeter iGreeter = username->System.out.println("Hello "+username);
		iGreeter.greetMessage("Priya");
			
		//Reference to a static method in Trial
		//implementation
		IGreeter iGreeter1 = Trial::sayHello;
		//call
		iGreeter1.greetMessage("Jo");

		//		lambda
//		ICalculator calculator = (x,y)->System.out.println("Sum "+(x+y));
		
		//Reference to a non static method in Trial
	    //implementation
		Trial trial = new Trial();
		ICalculator calculator = new Trial()::printSum;
		//calling
		calculator.calculateSum(100, 200);
		
		
//		IConverter converter = str->str.toUpperCase();
		
		IConverter converter = String::toUpperCase;
		System.out.println(converter.convertName("sripriya"));
		
		
		}
	}

