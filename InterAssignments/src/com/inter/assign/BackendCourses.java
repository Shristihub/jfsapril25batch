package com.inter.assign;

public class BackendCourses implements IInstitute {

	@Override
	public String[] showCourses() {
		String [] backend = new String[] {"Java","Spring","Microservices"};
		return backend;
	}

}

// create the main class as Customer
// add psvm 
// create interface ref =  new implementation class
// call the method as   