package com.shristi.training;

public class Trial {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("100");
			System.out.println("Number " + num);
			System.exit(0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("close resources");
		}
		System.out.println("Work done");
	}

}
