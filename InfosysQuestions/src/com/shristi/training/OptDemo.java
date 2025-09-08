package com.shristi.training;

import java.util.Optional;

public class OptDemo {

	public static void main(String[] args) {
	
		Optional<String> opt = Optional.ofNullable("Sripriya");

        String result = opt
            .map(String::toUpperCase)
            .orElse(printDefault());
        System.out.println(result);
    }

    private static String printDefault() {
        System.out.println("Print default value...");
        return "Shristi";
    }
}

