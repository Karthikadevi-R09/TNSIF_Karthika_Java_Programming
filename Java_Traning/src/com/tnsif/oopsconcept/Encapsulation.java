package com.tnsif.oopsconcept;


public class Encapsulation {

	// Example: Student Information
	
	// private data members
	private String studentName;
	private int studentId;
	private double marks;

	// Getters and Setters
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	// toString method
	@Override
	public String toString() {
		return "Encapsulation [studentName=" + studentName + ", studentId=" + studentId + ", marks=" + marks + "]";
	}
}

