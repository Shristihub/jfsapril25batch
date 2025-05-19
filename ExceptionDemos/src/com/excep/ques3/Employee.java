package com.excep.ques3;
public class Employee {
	void checkName(String name) throws NameNotFoundException{
		if(name.startsWith("S"))
			System.out.println("Welcome "+name);
		else
			throw new NameNotFoundException("No name starting with S");
	}}
