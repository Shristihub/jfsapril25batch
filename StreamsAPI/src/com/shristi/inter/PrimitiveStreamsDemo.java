package com.shristi.inter;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamsDemo {

	public static void main(String[] args) {
		// convert list of integers into a  stream
		List<Integer> nums =Arrays.asList(10,20,30,40);
		int v = nums.stream()
//		     .mapToInt(numObj->numObj.intValue())
		     .mapToInt(Integer::intValue)
		     .sum();
		System.out.println(v);
		System.out.println();
		// convert values into a  stream
		Stream<Integer>  stream = Stream.of(100,200,44,66,88);
		//stream.sorted().forEach(System.out::println);
		int sum1 = Stream.of(10,20,30,40)
		  .reduce((x,y)->x+y).get();
		System.out.println("Sum "+sum1);
		
		
		
		
		int arr[] =  {10,88,45,71,23,55,3,33,658};
		// convert array to primitive stream
		IntStream arrstream = Arrays.stream(arr);
		int sum = arrstream.sum();
		
		sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		System.out.println();
		Arrays.stream(arr)
			.filter(num->num%2==0)
			.forEach(System.out::println);
		      
		OptionalInt opt = Arrays.stream(arr).max();
//		opt.ifPresent(System.out::println);
		
		int max = Arrays.stream(arr)
				.max()
				.orElseThrow(()->new RuntimeException());
		System.out.println(max);
		System.out.println();
		
		int first = Arrays.stream(arr)
					.filter(num->num>100) //[]
					.findFirst()
					.orElseThrow(()->new RuntimeException("number not greater than 1000"));
		System.out.println(first);	
		
		double val = Arrays.stream(arr).average().getAsDouble();
		System.out.println(val);
		
		LongStream.rangeClosed(50,80)
		.filter(num->num%2==0)
		.forEach(System.out::println);
		
	
		
	}
}













