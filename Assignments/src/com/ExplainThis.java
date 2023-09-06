package com;

		class Student {
		    // Instance variables
		    String name;
		    int age;

		    // Constructor
		    public Student(String name, int age) {
		        // Use 'this' keyword to refer to instance variables
		        this.name = name;
		        this.age = age;
		    }

		    // Method to display the details of the person
		    public void displayDetails() {
		        // Using 'this' to access instance variables within a method
		        System.out.println("Name: " + this.name);
		        System.out.println("Age: " + this.age);
		    }

		    // Method to compare two Person objects
		    public boolean isSameAge(Student otherStudent) {
		        // Using 'this' to refer to the current object
		        return this.age == otherStudent.age;
		    }
		}

		public class ExplainThis {
		    public static void main(String[] args) {
		        // Create two Student objects
		        Student student1 = new Student("Efi", 39);
		        Student student2 = new Student("Anna", 38);

		        // Call the displayDetails method on student1
		        student1.displayDetails();
		        student2.displayDetails();

		        // Call the isSameAge method on person1 to compare ages with student2
		        if (student1.isSameAge(student2)) {
		            System.out.println("Student 1 and Student 2 have the same age.");
		        } else {
		            System.out.println("Student 1 and Student 2 have different ages.");
		        }
		    }
		}
