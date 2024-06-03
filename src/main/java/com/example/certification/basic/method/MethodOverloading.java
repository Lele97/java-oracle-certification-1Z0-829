package com.example.certification.basic.method;

/**
 * Class that explains java boxing and unboxing
 */
public class MethodOverloading {

    /**
     * Main method to run the method overloading demo.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        // Demonstrating overloaded methods
        MethodOverloading demo = new MethodOverloading();

        // Calling the overloaded methods with different parameters
        System.out.println("Sum of two integers: " + demo.add(5, 10));
        System.out.println("Sum of three integers: " + demo.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + demo.add(5.5, 10.5));
        System.out.println("Sum of integer and double: " + demo.add(5, 10.5));
    }

    /**
     * Adds two integers and returns the sum.
     *
     * @param a First integer to add.
     * @param b Second integer to add.
     * @return The sum of the two integers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds three integers and returns the sum.
     *
     * @param a First integer to add.
     * @param b Second integer to add.
     * @param c Third integer to add.
     * @return The sum of the three integers.
     */
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Adds two doubles and returns the sum.
     *
     * @param a First double to add.
     * @param b Second double to add.
     * @return The sum of the two doubles.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Adds an integer and a double, and returns the sum.
     *
     * @param a Integer to add.
     * @param b Double to add.
     * @return The sum of the integer and the double.
     */
    public double add(int a, double b) {
        return a + b;
    }

    /**
     * Adds a double and an integer, and returns the sum.
     * This method demonstrates the flexibility of overloading with different parameter orders.
     *
     * @param a Double to add.
     * @param b Integer to add.
     * @return The sum of the double and the integer.
     */
    public double add(double a, int b) {
        return a + b;
    }
}
