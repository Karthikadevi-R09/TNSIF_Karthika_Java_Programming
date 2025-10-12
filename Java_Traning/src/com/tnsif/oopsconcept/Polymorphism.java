package com.tnsif.oopsconcept;

// ----- Method Overloading -----
class BankOperations {

	// deposit using cash
	void deposit(int amount) {
		System.out.println("Deposited ₹" + amount + " through cash.");
	}

	// deposit using cheque
	void deposit(String chequeNumber, int amount) {
		System.out.println("Deposited ₹" + amount + " using Cheque No: " + chequeNumber);
	}

	// deposit using online transfer
	void deposit(double amount, String accountNo) {
		System.out.println("Deposited ₹" + amount + " through online transfer to Account: " + accountNo);
	}
}

// ----- Method Overriding -----
class Instrument {
	void playSound() {
		System.out.println("Instrument: Producing a generic musical sound.");
	}
}

class Guitar extends Instrument {
	@Override
	void playSound() {
		System.out.println("Guitar: Strumming the strings melodically.");
	}
}

class Piano extends Instrument {
	@Override
	void playSound() {
		System.out.println("Piano: Playing harmonious tunes on the keys.");
	}
}

// ----- Main Class -----
public class Polymorphism {

	public static void main(String[] args) {

		System.out.println("---- Method Overloading ----");
		BankOperations bank = new BankOperations();
		bank.deposit(5000);
		bank.deposit("CHQ12345", 10000);
		bank.deposit(25000.75, "AC987654321");

		System.out.println("\n---- Method Overriding ----");
		Instrument i;

		i = new Guitar();
		i.playSound();

		i = new Piano();
		i.playSound();

	}
}
