package oop.concept.Abstraction;

public class Fish extends Animal {

    @Override
    void move() {
        System.out.println("Fish moves by swimming.");

    }

    @Override
    void eat() {
        System.out.println("Fish eats seafood.");

    }
}

