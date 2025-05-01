package com.abs.quest1;

public class ZooMain {

	public static void main(String[] args) {
			
		//super class ref =  sub class object
		Animal animal =  new Dog();
		animal.makeSound();
		animal =  new Cat();
		animal.makeSound();
		
		animal = new Lion();
		animal.makeSound();
		animal = new Fox();
		animal.makeSound();
		
		long x = 100;
		int  y = (int) x;
		
		WildAnimal wild = (WildAnimal) animal;
		wild.hunt();
		
		
	}

}

