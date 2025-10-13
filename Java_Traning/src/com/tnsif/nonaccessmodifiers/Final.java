package com.tnsif.nonaccessmodifiers;

// Parent class
public class Final {

    // final variable
    final int MAX_SCORE = 100;

    // final method
    final void showMaxScore() {
        System.out.println("Maximum score for the exam: " + MAX_SCORE);
    }

    public static void main(String[] args) {
        Final exam = new Final();

        // exam.MAX_SCORE = 150; //  Not allowed because MAX_SCORE is final
        exam.showMaxScore();

        // Create child object
        Child child = new Child();
        child.display();
    }
}

// Child class declared outside the parent class
class Child extends Final {

    // Cannot override final method, but can define new methods
    void display() {
        System.out.println("Child class method: cannot override showMaxScore()");
        System.out.println("Accessing final variable MAX_SCORE: " + MAX_SCORE);
    }
}

	
 