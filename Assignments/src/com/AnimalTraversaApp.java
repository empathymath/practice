package com;

import java.util.ArrayList;

public class AnimalTraversalProgram {
    public static void main(String[] args) {
        // Create an ArrayList of animals
        ArrayList<String> animals = new ArrayList<>();

        // Add some animals to the list
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Zebra");

        // Traverse or iterate through the ArrayList using a for-each loop
        System.out.println("List of Animals:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
