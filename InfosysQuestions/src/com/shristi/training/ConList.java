package com.shristi.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Priya");
		names.add("Raju");
		names.add("Rakesh");
		names.add("aarthi");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			names.remove("Raju");
			String name = iterator.next();
			System.out.println(name.toUpperCase());
		}
	}
}
