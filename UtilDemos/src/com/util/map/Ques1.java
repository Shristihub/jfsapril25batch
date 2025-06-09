package com.util.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ques1 {

	public static void main(String[] args) {
		//map where key is string - coursetype
		// valus is  a list of string - list of courses
		
		Map<String,List<String>> coursemap = new TreeMap<>();
		coursemap.put("frontend",Arrays.asList("Angular","React","Html"));
		coursemap.put("backend",Arrays.asList("java","spring","microservices"));
		coursemap.put("cloud",Arrays.asList("AWS","Azure","gcp"));
		coursemap.put("database",Arrays.asList("MySQL","Mongo","SQLServer"));
		coursemap.put("datascience",Arrays.asList("Django","ML","Python"));
		
		System.out.println(coursemap);
		System.out.println();
		Set<String> courseTypes = coursemap.keySet();
		for (String type : courseTypes) {
			System.out.println("****type**"+type);
			// get the value from the key - list
			List<String> coursenames = coursemap.get(type);
			for (String name : coursenames) {
				System.out.println(name);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
