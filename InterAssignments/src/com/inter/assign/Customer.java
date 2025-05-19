package com.inter.assign;

public class Customer {

	public static void main(String[] args) {
		IInstitute institute = new WebCourses();
		 String[] courses=institute.showCourses();
		 
		 for(String course:courses)
			 System.out.println(course);
	}

}
