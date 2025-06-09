package com.util.listdemos;

import java.util.*;

public class ArrListDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		System.out.println(names.size());
		//add values
		names.add("Priya");
		names.add("Raju");
		names.add("Rakesh");
		names.add("aarthi");
		System.out.println(names.size());
		System.out.println(names); //Priya,Raju,Rakesh
		names.set(1,"Lucky");
		System.out.println(names); //Priya,Helen, Lucky
		names.add(1,"Helen");
		names.add("David");
		names.add("100");
		System.out.println(names);//Priya,Helen, Lucky,Rakesh,David
	
		System.out.println(names.get(1));
		System.out.println();
		Collections.sort(names);
		System.out.println("Using Iterator");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name.toUpperCase());
		}
		System.out.println();
		System.out.println("Using ListIterator");
		ListIterator<String> listIterator = names.listIterator(4);
		while(listIterator.hasPrevious()) {
			String name = listIterator.previous();
			System.out.println(name.toUpperCase());
		}
		System.out.println();
		System.out.println("Using foreach");
		
		// sort the elements of collections
		
		for(String name:names)
			System.out.println(name);
	}

}






