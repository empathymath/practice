package com;

		// Superclass
		class Animal {
		    String name;
		    
		    // Constructor
		    public Animal(String name) {
		        this.name = name;
		    }
		    
		    // Method
		    public void speak() {
		        System.out.println(name + " makes a sound.");
		    }
		}

		// Subclass 1
		class Cat extends Animal {
		    // Constructor
		    public Cat(String name) {
		        super(name); // Call the constructor of the superclass
		    }
		    
		    // Method specific to Cat
		    public void purr() {
		        System.out.println(name + " purrs.");
		    }
		}

		// Subclass 2
		class Dog extends Animal {
		    // Constructor
		    public Dog(String name) {
		        super(name); // Call the constructor of the superclass
		    }
		    
		    // Method specific to Dog
		    public void bark() {
		        System.out.println(name + " barks.");
		    }
		}

		public class Inheritance {
		    public static void main(String[] args) {
		        // Create a Cat object
		        Cat myCat = new Cat("Whiskers");

		        // Create a Dog object
		        Dog myDog = new Dog("Buddy");

		        // Call methods specific to Cat and Dog
		        myCat.speak(); // This will output "Whiskers makes a sound."
		        myCat.purr();  // This will output "Whiskers purrs."

		        myDog.speak(); // This will output "Buddy makes a sound."
		        myDog.bark();  // This will output "Buddy barks."
		    }
		}

