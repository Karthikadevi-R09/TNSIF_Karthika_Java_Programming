package com.tnsif.nonaccessmodifiers;

public class Static {
	// static variable
    static int totalBooks;

    // static block
    static {
        totalBooks = 500;
        System.out.println("Library initialized with total books: " + totalBooks);
    }

    // static method
    static void showTotalBooks() {
        System.out.println("Total books in the library (static method): " + totalBooks);
    }

    public static void main(String[] args) {

        System.out.println("Accessing static variable from main method: " + totalBooks);

        // calling static method
        showTotalBooks();

        // updating static variable
        totalBooks += 50;
        System.out.println("Updated total books: " + totalBooks);
        showTotalBooks();
    }

}
