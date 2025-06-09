package com.util.listdemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedDemo {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		System.out.println(names.size());
		//add values
//		names.add("Priya");
//		names.add("Raju");
		names.addLast("Rakesh");
		names.addFirst("aarthi");
		System.out.println(names.size());
		for (String name : names) {
			System.out.println(name);
		}
		names.offerFirst("John");
		System.out.println(names.peek());
		System.out.println(names);
		System.out.println();
		System.out.println(names.poll());
		System.out.println(names);
		
		System.out.println();
		System.out.println(names.poll());
		System.out.println(names);
		
		System.out.println();
		System.out.println(names.poll());
		System.out.println(names);
		
		System.out.println();
		System.out.println(names.poll());
		System.out.println(names);
		
		System.out.println();
		System.out.println(names.remove());
		System.out.println(names);
		
		
		
		
	
	}
}
