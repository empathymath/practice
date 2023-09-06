package com;

//Define a custom exception class EmployeeException
class EmployeeException extends Exception {
 public EmployeeException(String message) {
     super(message);
 }
}

//Create a class that simulates an Employee
class Employee {
 private String name;
 private int age;

 public Employee(String name, int age) throws EmployeeException {
     if (age < 18 || age > 65) {
         throw new EmployeeException("Employee age must be between 18 and 65");
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

//Example usage of Employee and EmployeeException
public class EmployeeExceptionExample {
 public static void main(String[] args) {
     try {
         // Creating an employee with valid age
         Employee emp1 = new Employee("John", 30);
         System.out.println("Employee 1: " + emp1.getName() + " - Age: " + emp1.getAge());

         // Creating an employee with invalid age
         Employee emp2 = new Employee("Alice", 17); // This will throw an EmployeeException
         System.out.println("Employee 2: " + emp2.getName() + " - Age: " + emp2.getAge());
     } catch (EmployeeException e) {
         System.err.println("EmployeeException: " + e.getMessage());
     }
 }
}

