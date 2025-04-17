package com.shristi.arrays;

public class ArrDemo {
	public static void main(String[] args) {

		// declare an array
		int[] marks = new int[5];
//		System.out.println(marks);
		// initialize
		System.out.println(marks[0]); // 0
		System.out.println("Size " + marks.length);
		// populate
		marks[0] = 90;
		marks[1] = 80;
		marks[2] = 70;
		marks[3] = 85;

		for (int i = 0; i < 5; i++) {
			System.out.println("Student " + marks[i]);
		}
		System.out.println();
		// for each - returns value
		
		int sum = 0;
		for (int val : marks) {
			sum +=val;
//			System.out.println(val);
		}
		System.out.println(sum);

		
	}

}
