package com.util.listdemos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashDemo {

	public static void main(String[] args) {
		// unordered - hashcode value
		HashSet<String> names = new HashSet<>();
		names.add("Priya");
		names.add("oRaju");
		names.add("Rakesh");
		names.add("aarthi");
		names.add("Jenny");
		names.add("100");
		names.add(null);
		System.out.println(names.size());
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println();
		// ordered - insertion order
		LinkedHashSet<String> namess = new LinkedHashSet<>();
		namess.add("Priya");
		namess.add("Raju");
		namess.add("Rakesh");
		namess.add("aarthi");
		namess.add("Jenny");
		namess.add("100");
		namess.add(null);
		System.out.println(namess.size());
		System.out.println();
		for (String name : namess) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println();
		Comparator<String> comp = (o1, o2) -> {
			return o2.compareTo(o1);
		};

		comp = (o1, o2) -> o2.compareTo(o1);

		// sorted - in alphabetical order
		Set<String> tnamess = new TreeSet<>((o1, o2) -> o2.compareTo(o1) );
		tnamess.add("Priya");
		tnamess.add("Raju");
		tnamess.add("jegan");
		tnamess.add("Nandhu");
		tnamess.add("Zeenath");
		tnamess.add("Abhi");
		tnamess.add("Jenny");
//		tnamess.add("100");
//		tnamess.add("-540");
		System.out.println(tnamess.size());
		for (String name : tnamess) {
			System.out.println(name);
		}

		HashSet<String> set = new HashSet<String>();
		set.add("Priya");
		set.add("Abirami");
		set.add("Sri");
		System.out.println(set);
		
		TreeSet<String> sortednames = new TreeSet<>(set);
		System.out.println(sortednames);
		
		
	}
}
