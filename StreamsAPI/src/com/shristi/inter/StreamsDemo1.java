package com.shristi.inter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo1 {

	public static void main(String[] args) {
		Predicate<String> pred = str->str.length()>4;
		System.out.println(pred.test("Priya"));
		
		Function<String,String> fun = str->{
			return str.toUpperCase();
		};
		System.out.println(fun.apply("hello"));
		
		Consumer<String> con = str->System.out.println(str);
		
		
//		create a list
		List<String> fruits = 
		Arrays.asList("apple","orange","grapes","apple","pineapple","kiwi");
//		convert to stream perform intermediate operations
//		get the names that has length>4
		List<String> nfruits = fruits.stream()
		      .filter(str->str.length()>4) //refer line 10
		      .collect(Collectors.toList()); //call terminal operation
		System.out.println(nfruits);
		System.out.println();
		 System.out.println("Using map method");
		 //takes an input of one type and converts toanother type
		
		 Arrays.asList("apple","orange","apple","pineapple","kiwi","grapes")
		  .stream()
		  .filter(str->str.contains("p"))
//		  .map(str->str.toUpperCase())
		  .map(String::toUpperCase)
		  .distinct()
		  .sorted((o1,o2)->o2.compareTo(o1))
//		  .limit(2)
//		  .skip(2)
//		  .forEach(str->System.out.println(str.concat("is a fruit")));
		 .forEach(str->System.out.println(str.concat("is a fruit")));
		 // specialised streams, // method references
		 // executors, Future,CompletableFuture- async 
		 
		
		
		    
		
		
		
		
		
		
		
		
	}
}
