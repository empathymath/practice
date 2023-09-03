package com;
import java.util.Scanner;

public class ArithmeticOperations {
	 public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        int choice;
		        double num1, num2, result ;
		        {
		        
		        do {
		            System.out.println("Arithmetic Operations Menu:");
		            System.out.println("1. Addition");
		            System.out.println("2. Subtraction");
		            System.out.println("3. Multiplication");
		            System.out.println("4. Division");
		            System.out.print("Enter your choice (1/2/3/4): ");

		            choice = input.nextInt();

		       

		            System.out.print("Enter first number: ");
		            num1 = input.nextDouble();
		            System.out.print("Enter second number: ");
		            num2 = input.nextDouble();

		            switch (choice) {
		                case 1:
		                    result = num1 + num2;
		                    System.out.println("Result: " + result);
		                    break;
		                case 2:
		                    result = num1 - num2;
		                    System.out.println("Result: " + result);
		                    break;
		                case 3:
		                    result = num1 * num2;
		                    System.out.println("Result: " + result);
		                    break;
		                case 4:
		                    if (num2 == 0) {
		                        System.out.println("Error: Division by zero is not allowed.");
		                    } else {
		                        result = num1 / num2;
		                        System.out.println("Result: " + result);
		                    }
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please choose a valid operation.");
		            }
		        } while (choice != 4);

		        input.close();
		    }
	}
}

