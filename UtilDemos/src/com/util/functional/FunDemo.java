package com.util.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunDemo {
	public static void main(String[] args) {
		// interface ref = implementation class
//		Consumer<String> con = str->{
//			System.out.println("Have a great day "+str);
//		}
		// only implementation
		Consumer<String> con = str->System.out.println("Have a great day "+str);
		//call the method
		con.accept("Priya");
		Consumer<Integer> con1 = num->System.out.println("Square"+Math.pow(num, 2)); 
		con1.accept(25);
		
		Supplier<String> supp = ()->{
			return "Welcome to java";
		};
		
		Supplier<String> supp1 = ()-> "Welcome to java";
		// get the valus using get method
		//calling part
		System.out.println(supp1.get());
		
		
		Predicate<String> pred = str->{
			if(str.length()>5)
			  return true;
			else 
			 return false;
		};
		System.out.println(pred.test("Evergreen"));
		
		//takes an input of one type and returns an output of another type
	   Function<String,Integer> fun = str->{
		   if(str.equals("Priya"))
		      return str.length();
		   else
			  return str.length(); 
	   };
	   
	   System.out.println(fun.apply("Priya"));
		
		
	   
	   Function<Integer, Integer> fun2 = (num)-> num*2;
	   System.out.println(fun2.apply(10));
	 
	   Function<String,String> fun3 = str->str.toUpperCase();
	   System.out.println(fun3.apply("hello"));
	   
	   
	}

}














