package oop.concept.Interface;

public class Execution {

    public static void main(String[] args) {

        Eagle myEgale = new Eagle();

        myEgale.eat();
        myEgale.sound();
        myEgale.fly();

        System.out.println("Number of legs:" + Bird.numberOfLegs);
        System.out.println("Outer covering:" + Bird.outerCovering);
    }
}
