package com.tnsif.assignmentprograms;

public class Arrays {

    public static void main(String[] args) {

        // declare and initialize an array
        int numbers[] = {10, 20, 30, 40, 50};

        // display array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // calculate sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

