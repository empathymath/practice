package com;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of animals
        HashSet<String> animals = new HashSet<>();

        // Add some animals to the HashSet
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");
        animals.add("Elephant");
        animals.add("Giraffe");

        // Element to check
        String elementToCheck = "Lion";

        // Check if the element exists in the HashSet
        if (animals.contains(elementToCheck)) {
            System.out.println(elementToCheck + " exists in the HashSet.");
        } else {
            System.out.println(elementToCheck + " does not exist in the HashSet.");
        }
    }
}

