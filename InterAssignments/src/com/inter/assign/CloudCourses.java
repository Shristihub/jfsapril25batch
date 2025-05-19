package com.inter.assign;

public class CloudCourses implements IInstitute {

	@Override
	public String[] showCourses() {
	  return new String[] {"AWS","GCP","AZURE"} ;
	}

}
