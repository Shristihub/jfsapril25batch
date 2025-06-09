package com.util.comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaExamples {

	public static void main(String[] args) {
		List<Mobile> mobiles = Arrays.asList(
				new Mobile("S25","Samsung",90000),
				new Mobile("BX230","Nothing",20000),
				new Mobile("A22","OnePlus",60000),
				new Mobile("M52","Samsung",36000),
				new Mobile("G2233","IPhone",190000));
		
		
		System.out.println();
		// just implementation
		Comparator<Mobile> mob = (o1, o2)->{
			return o1.getBrand().compareTo(o2.getBrand());
		};
		// call sort method
		Collections.sort(mobiles, mob);	
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		
		System.out.println();
		System.out.println("by model");
		Collections.sort(mobiles,(o1,o2)->{
			return o1.getModel().compareTo(o2.getModel());
		});	
			
	for (Mobile mobile : mobiles) {
		System.out.println(mobile);
	}
		
	}
}
