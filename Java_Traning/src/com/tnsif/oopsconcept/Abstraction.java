package com.tnsif.oopsconcept;

abstract class Vehicle {
	// abstract method 
	abstract void start();

	// concrete method 
	void stop() {
		System.out.println("Vehicle stopped.");
	}
}

class Car extends Vehicle {
	// implementing abstract method
	void start() {
		System.out.println("Car started with key ignition.");
	}
}

class Bike extends Vehicle {
	// implementing abstract method
	void start() {
		System.out.println("Bike started with self start button.");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		// creating object using abstraction
		Vehicle v1 = new Car();
		v1.start();
		v1.stop();

		Vehicle v2 = new Bike();
		v2.start();
		v2.stop();
	}
}
