package com.shristi.basics;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Demo2 {
	
	public static void main(String[] args) {
		        int[] nums = {3, 5, 1, 4, 2, 5, 3};
		        Set<Integer> seen = new HashSet<>();

		        for (int num : nums) {
		        	
		            if (seen.contains(num)) {
		                System.out.println("First duplicate is: " + num);
//		                return;
		            }
		            seen.add(num);
		        }

	    String name="Sripriya";
	    String [] splitname = name.split("");
	    Set<String> sname = new HashSet<String>();
	    for(String ch:splitname) {
	    	if(sname.contains(ch)) {
	    		System.out.println("duplicate "+ch);
	    		return;
	    	}
	    	sname.add(ch);
	    }
	}

}
