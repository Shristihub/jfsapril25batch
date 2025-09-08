package com.shristi.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryResourceDemo {

	public static void main(String[] args) throws IOException {
		try(FileReader reader =  new FileReader("demo.txt");){
			int x = Integer.parseInt("100");
			System.out.println(x);
		}
	}
}
