package com.util.map;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class SortDemo {

	public static void main(String[] args) {
	
		Map<Integer,String> names = new HashMap<>();
		names.put(90, "Priya");
		names.put(12, "Priya");
		names.put(31, "null");
		names.put(24, "Raju");
		names.put(66, "Rohan");
		names.put(78, "Arul");
		System.out.println(names);
		
		// convert the hashmap to a treemap - sorted in ascending order
		TreeMap<Integer, String> sortedmap = new TreeMap<>(names);
		System.out.println(sortedmap);
		//print the  keys in descending order
		NavigableMap<Integer,String> naviMap = sortedmap.reversed();
		System.out.println(naviMap);
		
		
		
		

		

	}

}
