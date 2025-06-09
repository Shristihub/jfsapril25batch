package com.util.listdemos;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		// create an ArrayList
		List<Student> studentList = new ArrayList<>();
		// create a student object
		Student student = new Student("Raju", 1, "Chennai");
		// add this to the list
		studentList.add(student);

		// add student object directly
		studentList.add(new Student("Priya", 2, "Mysore"));
		studentList.add(new Student("Kumaran", 3, "Mysore"));
		studentList.add(new Student("Monu", 4, "Bangalore"));
		studentList.add(new Student("Harini", 5, "Bangalore"));
		studentList.add(new Student("Hari", 6, "Hyd"));

		System.out.println(studentList);

		System.out.println("Printing all students");
		for (Student student11 : studentList)
			System.out.println(student11.getStudentName());

		String city = "Mysore";

		System.out.println("Students by city");
		// create a temp list
		List<Student> studentsByCity = new ArrayList<Student>();

		// iterate thru the original list
		for (Student nstudent : studentList) {
			// get the city of each student
			String ncity = nstudent.getCity();
			// check if ncity is same ad city'Bangalore'

			if (ncity.equals(city)) {
				// add the student to a temp list
				studentsByCity.add(nstudent);
			}
		}
		for (Student stud : studentsByCity) {
			System.out.println(stud);
		}
		

	}
}
