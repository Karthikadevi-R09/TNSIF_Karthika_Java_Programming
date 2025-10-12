package com.tnsif.oopsconcept;

public class InheritanceDemo {

	public static void main(String[] args) {

		System.out.println("----- Single Inheritance -----");
		Employee emp = new Employee("Karthikadevi", "Software Development");
		emp.showDetails();

		System.out.println("\n----- Multilevel Inheritance -----");
		Son s = new Son();
		s.sonInfo();
		s.fatherInfo();
		s.grandFatherInfo();

		System.out.println("\n----- Hierarchical Inheritance -----");
		Laptop l = new Laptop();
		l.powerOn();
		l.laptopInfo();

		System.out.println();

		Smartphone p = new Smartphone();
		p.powerOn();
		p.smartphoneInfo();

		System.out.println();

		Tablet t = new Tablet();
		t.powerOn();
		t.tabletInfo();

		System.out.println("\n----- Multiple Inheritance (via Interfaces) -----");
		ChildClass cc = new ChildClass();
		cc.messageA();
		cc.messageB();
	}
}

