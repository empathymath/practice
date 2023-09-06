package com;

public class OverloadingApp {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        OverloadingApp app = new OverloadingApp();

        // Calling the overloaded methods
        int sum1 = app.add(5, 10);
        int sum2 = app.add(5, 10, 15);
        double sum3 = app.add(2.5, 3.5);
        String concatStrings = app.add("Hello, ", "world!");

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
        System.out.println("Concatenation: " + concatStrings);
    }
}
