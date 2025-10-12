package com.tnsif.oopsconcept;

public class EncapsulationDemo {
	public static void main(String[] args) {

		// Create object of Encapsulation class
		Encapsulation student = new Encapsulation();

		// Set values using setters
		student.setStudentName("Karthikadevi");
		student.setStudentId(101);
		student.setMarks(98.6);

		// Display values using getters
		System.out.println("Student Name: " + student.getStudentName());
		System.out.println("Student ID: " + student.getStudentId());
		System.out.println("Marks: " + student.getMarks());

		// Or directly print using toString()
		System.out.println(student);
	}

}
