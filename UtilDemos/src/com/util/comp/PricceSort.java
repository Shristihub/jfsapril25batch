package com.util.comp;

import java.util.Comparator;

public class PricceSort implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
	   return ((Double)o1.getPrice()).compareTo(o2.getPrice());
	}

}
