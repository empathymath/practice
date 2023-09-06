package com;

//Define a custom exception class CustomEmployeeException
class CustomEmployeeException extends Exception {
 public CustomEmployeeException(String message) {
     super(message);
 }
}

//Create a class to represent an Employee
class Employee {
 private String name;
 private int age;

 public Employee(String name, int age) throws CustomEmployeeException {
     if (age < 18) {
         throw new CustomEmployeeException("Employee age must be 18 or older.");
     }
     this.name = name;
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }
}

public class CustomEmployeeExceptionExample {
 public static void main(String[] args) {
     try {
         // Creating an employee with a valid age
         Employee emp1 = new Employee("John", 30);
         System.out.println("Employee 1: " + emp1.getName() + " - Age: " + emp1.getAge());

         // Creating an employee with an invalid age
         Employee emp2 = new Employee("Alice", 16); // This will throw a CustomEmployeeException
         System.out.println("Employee 2: " + emp2.getName() + " - Age: " + emp2.getAge());
     } catch (CustomEmployeeException e) {
         System.err.println("CustomEmployeeException: " + e.getMessage());
     }
 }
}

