package com.shristi.inter;

import java.util.Arrays;

public class StreamsDemo2 {

	public static void main(String[] args) {
		
		 Arrays.asList("java","angular","spring","css","html","javascript")
		 .stream()
		 .filter(course->course.contains("a"))
//		 .map(str->str.length())
		 .map(String::length)
//		 .forEach(str->System.out.println(str));
		 .forEach(System.out::println);
	}
}
