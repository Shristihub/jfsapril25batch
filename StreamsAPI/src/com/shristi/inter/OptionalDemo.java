package com.shristi.inter;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
//		String str = "Priya";
//		Optional<String> opt = Optional.of(str);
//		System.out.println(opt.get());
//		
////		str = null;
//		opt = Optional.ofNullable(str);
//		if(opt.isPresent())
//			System.out.println(opt.get());
//		
//		if(opt.isEmpty())
//			System.out.println("no value");
//		
//		opt.ifPresent(str1->System.out.println(str1));
				
		System.out.println("FindFirst");
		Optional<String> optfruit = Arrays.asList("apple","orange","apple","pineapple","kiwi","grapes")
				  .stream()
				  .filter(fr->fr.contains("b")) //[]
				  .findFirst(); //empty
		// check before printing
		if(optfruit.isPresent())
			System.out.println(optfruit.get());
		
		
		
		System.out.println("-----or else------");
		String fruit = Arrays.asList("apple","orange","apple","pineapple","kiwi","grapes")
		  .stream()
		  .filter(fr->fr.contains("p")) //[]
		  .findFirst() //apple
		  .orElse(getFruit());
		System.out.println(fruit);
//		
		System.out.println("-----or else get-----");
		String fruit1 = Arrays.asList("apple","orange","apple","pineapple","kiwi","grapes")
		  .stream()
		  .filter(fr->fr.startsWith("p")) //apple, pineapple,apple,grapes
		  .findFirst()
		  .orElseGet(()->getFruit());
		 
		System.out.println(fruit1);
		
		}
	
	    public static String getFruit() {
	    	System.out.println("alternate fruit");
	    	return "banana"; 
	    }
}









