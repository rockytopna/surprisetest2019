package oop.concept.Abstraction;

public class Bird extends Animal {

    @Override
    void move() {
        System.out.println("Bird moves by Flying");
    }

    @Override
    void eat() {
        System.out.println("Bird eats bird food");
    }
}
