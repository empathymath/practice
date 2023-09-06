package com;
import java.util.HashSet;
import java.util.Iterator;

public class AnimalHashSetTraversal {
    public static void main(String[] args) {
        // Create a HashSet of animal names
        HashSet<String> animalSet = new HashSet<>();

        // Add some animal names to the HashSet
        animalSet.add("Lion");
        animalSet.add("Tiger");
        animalSet.add("Bear");
        animalSet.add("Elephant");
        animalSet.add("Giraffe");

        // Method 1: Using an enhanced for loop (for-each loop)
        System.out.println("Traversing HashSet using an enhanced for loop:");
        for (String animal : animalSet) {
            System.out.println(animal);
        }

        // Method 2: Using an Iterator
        System.out.println("\nTraversing HashSet using an Iterator:");
        Iterator<String> iterator = animalSet.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }
    }
}

