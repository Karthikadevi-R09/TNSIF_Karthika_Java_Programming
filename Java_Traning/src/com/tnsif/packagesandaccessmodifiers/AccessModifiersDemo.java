package com.tnsif.packagesandaccessmodifiers;

public class AccessModifiersDemo {
	// variables with different access levels
		public String studentName = "Karthikadevi";  
		private int studentId = 101;                 
		protected double marks = 95.6;               
		String department = "AI&DS";               

		// method to display all details
		public void showDetails() {
			System.out.println("Public Variable (Name): " + studentName);
			System.out.println("Private Variable (ID): " + studentId);
			System.out.println("Protected Variable (Marks): " + marks);
			System.out.println("Default Variable (Department): " + department);
		}

		public static void main(String[] args) {
			AccessModifiersDemo student = new AccessModifiersDemo();
			student.showDetails();
		}

}
