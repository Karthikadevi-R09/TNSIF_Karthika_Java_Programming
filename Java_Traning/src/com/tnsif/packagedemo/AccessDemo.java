package com.tnsif.packagedemo;

import com.tnsif.packagesandaccessmodifiers.AccessModifiersDemo;

public class AccessDemo {
	public static void main(String[] args) {

		AccessModifiersDemo student = new AccessModifiersDemo ();
			
		    System.out.println("Public Variable (Name): " + student.studentName);
			/*
			 *System.out.println("Private Variable (ID): " + student.studentId);
			 *System.out.println("Protected Variable (Marks): " + student.marks);
			 *System.out.println("Default Variable (Department): " + student.department);
			 */


		
		}

}
