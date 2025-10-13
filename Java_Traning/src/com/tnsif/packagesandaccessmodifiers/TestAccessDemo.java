package com.tnsif.packagesandaccessmodifiers;

public class TestAccessDemo {
public static void main(String[] args) {
		
		AccessModifiersDemo amd = new AccessModifiersDemo();
		
		System.out.println("--- Accessing Variables from Another Class (Same Package) ---");
		System.out.println("Public Variable: " + amd.studentName);
		// System.out.println("Private Variable: " + amd.studentId); // ❌ Not accessible
		System.out.println("Protected Variable: " + amd.marks);
		System.out.println("Default Variable: " + amd.department);
	}

}
