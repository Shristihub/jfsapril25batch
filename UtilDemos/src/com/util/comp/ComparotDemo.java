package com.util.comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparotDemo {

	public static void main(String[] args) {

		List<Mobile> mobiles = Arrays.asList(
				new Mobile("S25","Samsung",90000),
				new Mobile("BX230","Nothing",20000),
				new Mobile("A22","OnePlus",60000),
				new Mobile("M52","Samsung",36000),
				new Mobile("G2233","IPhone",190000));
		
		//pass the object of the class that implements Comparator
		
		System.out.println();
		Collections.sort(mobiles, new BrandSort());
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		System.out.println();
		System.out.println("By model");
		Collections.sort(mobiles, new ModelSort());
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		
		System.out.println();
		System.out.println("By price");
		Collections.sort(mobiles, new PricceSort());
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		
		
		
		
		
	}

}
