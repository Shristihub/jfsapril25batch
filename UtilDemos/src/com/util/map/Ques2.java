package com.util.map;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class Ques2 {

	public static void main(String[] args) {
		// key -  department - id, name, head
		//value - student - student id, name, city
		// pass compat ref
		Comparator<Department> comp = (o1,o2)->o1.getdeptName().compareTo(o2.getdeptName());
		
		TreeMap<Department,List<Student>> details = new TreeMap<>(comp);
		//create 3 dep objects - "ECE,CSE,CIVIL
		// each dept has 3 students
		Department dept =  new Department("ECE", 11, "Raju");
		//create 3 student object and add to ece dept
		
		
	}
}
