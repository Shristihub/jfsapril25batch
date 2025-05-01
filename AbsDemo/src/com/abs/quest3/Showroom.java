package com.abs.quest3;

import java.util.Scanner;

public class Showroom {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter choice");
//		String choice = sc.next();//car or bike
//		//create a vehilce reference
//		Vehicle vehicle = null;
//		if(choice.equals("car")) {
//			vehicle = new Car("Audi","X100",2000000);
//		    vehicle.getMileage();
//		    vehicle.printDetails();
//		}else if(choice.equals("bike")) {
//			vehicle = new Bike("Bajaj","Pulsar","Dash cam");
//			vehicle.getMileage();
//			vehicle.printDetails();
//		}else
//			System.out.println("Wrong input");
		
		//class cast exception
		Vehicle vehicle = new Car("Audi","X100",2000000);
	    vehicle.getMileage();
	    vehicle.showAccessories();
	    vehicle.showRoomDetails();
	    
	    
	    long x =10;
		int y =(int) x; //downcasting
		// print the method of Car
		Car car = (Car)vehicle;// downcasting
		car.printFeatures();
		
	    
	    vehicle = new Bike("Bajaj","Pulsar","Dash cam");
		vehicle.getMileage();
		vehicle.showAccessories();
		Bike bike = (Bike)vehicle;
		String[] access=bike.showBikeTypes();
		for(String acc:access)
			System.out.println(acc);
		
		for (String acc : access) {
			System.out.println(acc);
		}
		
		
		
		
		
		
		
		
	}

}
