package com;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementExistsInArrayList {
    public static void main(String[] args) {
        // Create an ArrayList with 10 elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(100);

        // Prompt the user for the element to check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to check: ");
        int elementToCheck = scanner.nextInt();

        // Check if the element exists in the ArrayList
        if (arrayList.contains(elementToCheck)) {
            System.out.println(elementToCheck + " exists in the ArrayList.");
        } else {
            System.out.println(elementToCheck + " does not exist in the ArrayList.");
        }
    }
}

