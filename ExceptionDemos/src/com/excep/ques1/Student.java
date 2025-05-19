package com.excep.ques1;

public class Student {

	void checkName(String name) throws Exception {
		if(name.equals("Sri"))
			System.out.println("Welcome "+name);
		else
		  throw new Exception("Wrong username");	
	}
}
