package com;
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);

	        System.out.println("Enter three numbers: ");

	        // Read three numbers from the user
	        int num1 = input.nextInt();
	        int num2 = input.nextInt();
	        int num3 = input.nextInt();

	        // Assume num1 is the largest initially
	        int largest = num1;

	        // Compare num2 and num3 with num1 to find the largest
	        if (num2 > largest) {
	            largest = num2;
	        }

	        if (num3 > largest) {
	            largest = num3;
	        }

	        // Print the largest number
	        System.out.println("The largest number is: " + largest);

	        // Close the scanner
	        input.close();
	    }
	}
