package com.inter.basic.lamb;

public class Lamb3 {
	public static void main(String[] args) {
		IPrinter printer = message->{
			return message.toUpperCase();
		};
		//call
		System.out.println(printer.printMsg("good morning"));
		
		printer = message->message.concat("!!!!");
		System.out.println(printer.printMsg("good night"));
		
		IMovies movieref = ()-> new String[] {"24","Alagan"};
		String[] movies =  movieref.showMovies();
		for (String mo : movies) {
			System.out.println(mo);
		}
		//implementation
		IFactory factory =  type->{
			if(type.equals("shoes"))
				return new String[] {"Nike","Power"};
			else if(type.equals("headphones"))
				return new String[] {"Samsung","Boat"};
			else 
				return new String[]{"no such product"};
				
		};
		//call
		String[] products = factory.showProducts("headphones");
		for (String product : products) {
			System.out.println(product);
		}
		
	}

}
