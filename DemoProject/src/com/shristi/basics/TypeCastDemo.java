package com.shristi.basics;

public class TypeCastDemo {

	public static void main(String[] args) {
		int x = 100;
		int z;
		long y = x; //upcasting
		double a = y*2;
		System.out.println(a);
		
		//downcasting
		float val = (float)a;
		int num =(int) val;
		System.out.println(num);
		
		
		
	}

}
