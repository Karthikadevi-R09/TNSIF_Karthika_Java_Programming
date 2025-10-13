package com.tnsif.assignmentprograms;

public class Singleton {

    // create only one instance
    private static Singleton obj = new Singleton();

    // private constructor
    private Singleton() {}

    // method to return the single object
    public static Singleton getInstance() {
        return obj;
    }

    // method to display message
    public void show() {
        System.out.println("This is a Singleton class");
    }

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.show();
    }
}

