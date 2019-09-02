package oop.concept.Polymorphism;

public class Execution {

    public static void main(String[] args) {


        Bird myBird = new Bird();
        myBird.fly();
        myBird.fly(10000);
        myBird.fly("Dove", 10000);

    }
}
