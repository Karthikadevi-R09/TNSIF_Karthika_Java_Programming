package com.tnsif.assignmentprograms;

// Marker interface (no methods)
interface Marker {  
}

// Class implementing the marker interface
public class MarkerInterface implements Marker {

    void display() {
        System.out.println("Marker interface implemented successfully!");
    }

    public static void main(String[] args) {
        MarkerInterface obj = new MarkerInterface();

        if (obj instanceof Marker) {
            System.out.println("Object is marked using Marker interface.");
            obj.display();
        } else {
            System.out.println("Object is NOT marked.");
        }
    }
}

