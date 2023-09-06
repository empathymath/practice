package com;

//Define an Animal interface
interface Animal {
 // Method to get the name of the animal
 String getName();

 // Method to make the animal sound
 void makeSound();
}

//Implement the Animal interface for a Dog class
class Dog implements Animal {
 private String name;

 public Dog(String name) {
     this.name = name;
 }

 @Override
 public String getName() {
     return name;
 }

 @Override
 public void makeSound() {
     System.out.println(name + " barks: Woof! Woof!");
 }
}

//Implement the Animal interface for a Cat class
class Cat implements Animal {
 private String name;

 public Cat(String name) {
     this.name = name;
 }

 @Override
 public String getName() {
     return name;
 }

 @Override
 public void makeSound() {
     System.out.println(name + " meows: Meow! Meow!");
 }
}

public class AnimalInterfaceExample {
 public static void main(String[] args) {
     Animal dog = new Dog("Buddy");
     Animal cat = new Cat("Whiskers");

     System.out.println("Dog's name: " + dog.getName());
     dog.makeSound();

     System.out.println("Cat's name: " + cat.getName());
     cat.makeSound();
 }
}
