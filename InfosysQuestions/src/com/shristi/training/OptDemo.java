package com.shristi.training;

import java.util.Optional;

public class OptDemo {

	public static void main(String[] args) {
		Optional<String> opt = Optional.of("Priya");
		if(opt.isPresent())
			System.out.println(opt.get());
	
	Optional<String> opt1 = Optional.of(null);
//	if(opt1.isPresent())
		System.out.println(opt1.get());
 }


}
