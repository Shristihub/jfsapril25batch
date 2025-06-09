package com.shristi.inter;


public class Test {
	public static void main(String[] args){
		StringBuffer sb1 = new StringBuffer("GFG");

	    StringBuffer sb2 = new StringBuffer("GFG");

	    System.out.println(sb1.equals(sb2));

	    String s1 = "ABC";

	    StringBuffer sb3 = new StringBuffer("ABC");

	   System.out.println(s1.equals(sb3));

	   String s2 = sb3.toString();

	    System.out.println(s1.equals(s2));


	}

}
