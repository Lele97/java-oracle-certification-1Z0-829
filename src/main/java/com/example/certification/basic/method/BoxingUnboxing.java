package com.example.certification.basic.method;

/**
 * Class that explains java boxing and unboxing
 */
public class BoxingUnboxing {

    /**
     * Main method to run the boxing and unboxing demo.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Demonstrating boxing
        demonstrateBoxing();

        // Demonstrating unboxing
        demonstrateUnboxing();

        // Demonstrating auto-boxing and auto-unboxing
        demonstrateAutoBoxingUnboxing();
    }

    /**
     * Demonstrates boxing in Java.
     * Boxing is the process of converting a primitive type into its corresponding wrapper type.
     */
    public static void demonstrateBoxing() {
        int primitiveInt = 10;
        // Boxing: converting primitive int to Integer object
        Integer boxedInt = Integer.valueOf(primitiveInt);
        System.out.println("Boxed Integer: " + boxedInt);

        double primitiveDouble = 3.14;
        // Boxing: converting primitive double to Double object
        Double boxedDouble = Double.valueOf(primitiveDouble);
        System.out.println("Boxed Double: " + boxedDouble);
    }

    /**
     * Demonstrates unboxing in Java.
     * Unboxing is the process of converting a wrapper type back into its corresponding primitive type.
     */
    public static void demonstrateUnboxing() {
        Integer boxedInt = Integer.valueOf(20);
        // Unboxing: converting Integer object to primitive int
        int unboxedInt = boxedInt.intValue();
        System.out.println("Unboxed int: " + unboxedInt);

        Double boxedDouble = Double.valueOf(6.28);
        // Unboxing: converting Double object to primitive double
        double unboxedDouble = boxedDouble.doubleValue();
        System.out.println("Unboxed double: " + unboxedDouble);
    }

    /**
     * Demonstrates auto-boxing and auto-unboxing in Java.
     * Auto-boxing is the automatic conversion of primitive types to their corresponding wrapper types.
     * Auto-unboxing is the automatic conversion of wrapper types to their corresponding primitive types.
     */
    public static void demonstrateAutoBoxingUnboxing() {
        // Auto-boxing: converting primitive int to Integer object
        Integer autoBoxedInt = 30;
        System.out.println("Auto-boxed Integer: " + autoBoxedInt);

        // Auto-unboxing: converting Integer object to primitive int
        int autoUnboxedInt = autoBoxedInt;
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);

        // Auto-boxing: converting primitive double to Double object
        Double autoBoxedDouble = 9.42;
        System.out.println("Auto-boxed Double: " + autoBoxedDouble);

        // Auto-unboxing: converting Double object to primitive double
        double autoUnboxedDouble = autoBoxedDouble;
        System.out.println("Auto-unboxed double: " + autoUnboxedDouble);
    }
}