package com.util.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
		Map<Integer,String> names = new HashMap<>();
		names.put(90, "Priya");
		names.put(12, "Priya");
		names.put(31, "null");
		names.put(24, "Raju");
		names.put(null, "Rohan");
		names.put(78, "Arul");
		System.out.println(names);
		
		System.out.println(names.get(12));
		System.out.println(names.get(100));//null
		System.out.println(names.containsKey(100));
		
		System.out.println(names.getOrDefault(100,"Julie"));//julie
		
		// get all the keys which is a set
		Set<Integer> keys = names.keySet();
		System.out.println(keys);
		// iterate thru the keys
		for(Integer key:keys) {
			// get the value from the key
			String name = names.get(key);
			System.out.println(name);
		}
		System.out.println();
		
		// convert map into a entryset
		Set<Map.Entry<Integer,String>>entries =   names.entrySet();
		System.out.println(entries);
				
		for(Map.Entry<Integer,String> entry:entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" "+value);
		}
		
;		
		

	}

}
