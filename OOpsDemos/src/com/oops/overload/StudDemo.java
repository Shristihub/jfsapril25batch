package com.oops.overload;

public class StudDemo {
	public void sum(int... marks) {
		// create a variable for sum
		int sum = 0;
		for (int mark : marks)
			sum += mark;
		System.out.println("Sum " + sum);
	}

	public static void main(String[] args) {
		StudDemo st = new StudDemo();
		st.sum(90);
		st.sum(90, 80, 70);
		st.sum(90, 80, 88, 92, 95);
	}

}
