package com;

import java.util.*;

public class StudentNameSets {
    public static void main(String[] args) {
        // Create a HashSet to store student names
        Set<String> hashSet = new HashSet<>();

        // Create a LinkedHashSet to store student names
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Create a TreeSet to store student names
        Set<String> treeSet = new TreeSet<>();

        // Add 10 student names to each set
        hashSet.add("John");
        hashSet.add("Alice");
        hashSet.add("Bob");
        hashSet.add("Emily");
        hashSet.add("David");
        hashSet.add("Ella");
        hashSet.add("Frank");
        hashSet.add("Grace");
        hashSet.add("Henry");
        hashSet.add("Isabella");

        linkedHashSet.add("John");
        linkedHashSet.add("Alice");
        linkedHashSet.add("Bob");
        linkedHashSet.add("Emily");
        linkedHashSet.add("David");
        linkedHashSet.add("Ella");
        linkedHashSet.add("Frank");
        linkedHashSet.add("Grace");
        linkedHashSet.add("Henry");
        linkedHashSet.add("Isabella");

        treeSet.add("John");
        treeSet.add("Alice");
        treeSet.add("Bob");
        treeSet.add("Emily");
        treeSet.add("David");
        treeSet.add("Ella");
        treeSet.add("Frank");
        treeSet.add("Grace");
        treeSet.add("Henry");
        treeSet.add("Isabella");

        // Display the contents of each set
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
