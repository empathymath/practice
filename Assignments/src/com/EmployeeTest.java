package com;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;

    // Constructor to initialize the employee details
    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    // Method to calculate and update salary based on designation
    public void calSalary() {
        if (designation .equals("manager") ) {
            salary += 5000;
        } else if (designation.equals("developer" )) {
            salary += 3000; 
        } else {
            salary += 1000;
        }
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Designation: " + designation);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read employee details from the user
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();

        // Create an Employee object and initialize it
        Employee employee = new Employee(id, name, salary, designation);

        // Calculate the salary
        employee.calSalary();

        // Display employee details
        System.out.println("\nEmployee Details:");
        employee.display();

        // Close the scanner
        scanner.close();
    }
}
