package oop.concept.Interface;

public class Eagle implements Animal, Bird {

    @Override
    public void eat() {
        System.out.println("Eagle eats anything");

    }

    @Override
    public void sound() {
        System.out.println("Eagle has high pitch sound");


    }

    @Override
    public void fly() {
        System.out.println("Eagle flies up to 10,0000 feet in the air");
    }
}
