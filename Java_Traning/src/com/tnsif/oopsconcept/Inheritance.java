package com.tnsif.oopsconcept;

// ----- Single Inheritance -----
class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	void showName() {
		System.out.println("Person Name: " + name);
	}
}

class Employee extends Person {
	String department;

	Employee(String name, String department) {
		super(name);
		this.department = department;
	}

	void showDetails() {
		showName();
		System.out.println("Department: " + department);
	}
}

// ----- Multilevel Inheritance -----
class GrandFather {
	void grandFatherInfo() {
		System.out.println("Grandfather: I am the head of the family.");
	}
}

class Father extends GrandFather {
	void fatherInfo() {
		System.out.println("Father: I guide my children.");
	}
}

class Son extends Father {
	void sonInfo() {
		System.out.println("Son: I love learning new things!");
	}
}

// ----- Hierarchical Inheritance -----
class Device {
	void powerOn() {
		System.out.println("Device is powered on.");
	}
}

class Laptop extends Device {
	void laptopInfo() {
		System.out.println("Laptop: Used for programming and office work.");
	}
}

class Smartphone extends Device {
	void smartphoneInfo() {
		System.out.println("Smartphone: Used for communication and entertainment.");
	}
}

class Tablet extends Device {
	void tabletInfo() {
		System.out.println("Tablet: Used for reading and watching videos.");
	}
}

// ----- Multiple Inheritance -----
/*
 * Note: Multiple inheritance (two parent classes) is NOT supported directly
 * in Java using classes, only via interfaces.
 */

interface ParentA {
	void messageA();
}

interface ParentB {
	void messageB();
}

class ChildClass implements ParentA, ParentB {
	public void messageA() {
		System.out.println("Message from ParentA");
	}

	public void messageB() {
		System.out.println("Message from ParentB");
	}
}

