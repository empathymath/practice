package com;


	class Employee{
	    private int id;
	    private String name;

	    // Parameterized constructor
	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    // Getter methods
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }
	}
//create constructor
	public class Constructor {
	    public static void main(String[] args) {
	        // Creating an instance of the E class using the constructor
	        Employee employee1 = new Employee(1, "Efi");
	        Employee employee2 = new Employee(2, "anna");

	        // Accessing the student information using getter methods
	        System.out.println("Employee 1 ID: " + employee1.getId());
	        System.out.println("Employee 1 Name: " + employee1.getName());

	        System.out.println("Employee 2 ID: " + employee2.getId());
	        System.out.println("Employee 2 Name: " + employee2.getName());
	    }


	}
