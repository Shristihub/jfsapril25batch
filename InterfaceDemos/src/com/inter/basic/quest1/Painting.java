package com.inter.basic.quest1;

public class Painting extends ArtsClub{

	@Override
	public void printTariff(String type) {
		if(type.equals("brush"))
			System.out.println("12 classes 4000");
		else
			System.out.println("12 classes 8000");
	}

}
