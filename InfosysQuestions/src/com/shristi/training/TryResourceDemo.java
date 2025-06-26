package com.shristi.training;

import java.io.FileReader;
import java.io.IOException;

public class TryResourceDemo {

	public static void main(String[] args)throws IOException {
		try(FileReader fileReader = new FileReader("demo.txt");) {
		int num = Integer.parseInt("100");
		System.out.println("Number "+num);
		System.exit(0);
		}
		System.out.println("Work done");
	}
}
