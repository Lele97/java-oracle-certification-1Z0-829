package com.example.certification.basic.method;

/**
 * Class that explains java method
 */
public class Method {

    /**
     * Designing method
     * <p>
     * - "public" Access modifier
     * - "static" Optional specifier
     * - "void" Return type
     * - "nap(int minutes)" Method signature
     * - "throws" Exeption
     */
    public static void nap(int minutes) throws InterruptedException {
    }

    /**
     * Method Static Members
     * - "tax" belongs to a class (not to an instance of the class)
     */
    public static double tax = 0.2;

    public static double getPrize(double inputPrize) {
        double margin = 0.05;
        return inputPrize * (1 + tax) * (1 + margin);
    }

    /**
     * Main method
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        //Inizialize String and Array
        String[] names = {"Gabriele", "Peter", "Mark"};
        String greeting = "hello";
        //Istance of class Method
        Method m = new Method();
        //Call method greet
        m.greet(greeting, names);

        //Istance of class Method
        Method m2 = new Method();
        System.out.println(m2.getPrize(100)); // tax = 0.2 inputPrize = 126
        Method m3 = new Method();
        m3.tax = 0.1; //tax = 0.1 for all instances of the class!
        System.out.println(m3.getPrize(100)); // tax = 0.1 inputPrize = 115.5
        System.out.println(m2.getPrize(100)); // tax = 0.1 inputPrize = 115.5

        //direct access to the static member without instantiating the class
        tax = 0.3; // tax = 0.3
        System.out.println(getPrize(100));// tax = 0.3 inputPrize = 136.5
    }

    /**
     * Method Variable Arguments
     *
     * @param greeting Array as varargs
     * @param names
     */
    public void greet(String greeting, String... names) {
        for (String name : names) {
            System.out.println(greeting + ", " + name + "!");
        }
    }
}
