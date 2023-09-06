package com;

abstract class AnimalAbstract {
    // Fields (attributes)
    private String name;
    private int age;

    // Constructor
    public AnimalAbstract(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method for making the animal sound
    public abstract void makeSound();

    // Abstract method to describe the animal
    public abstract void describe();

    // Getter and Setter methods for name and age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method to provide a string representation of the animal
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

// Example usage of the AnimalAbstract class
class Dog extends AnimalAbstract {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void describe() {
        System.out.println("This is a dog named " + getName() + " and it is " + getAge() + " years old.");
    }
}

class Cat extends AnimalAbstract {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    @Override
    public void describe() {
        System.out.println("This is a cat named " + getName() + " and it is " + getAge() + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);

        System.out.println("Dog details:");
        System.out.println(dog.toString());
        dog.makeSound();
        dog.describe();

        System.out.println("\nCat details:");
        System.out.println(cat.toString());
        cat.makeSound();
        cat.describe();
    }
}


}
