package oop.concept.Abstraction;

public class Execution {

    public static void main(String[] args) {
        Animal myBird = new Bird();

        System.out.println("********Test Bird***********");

        myBird.label();
        myBird.move();
        myBird.eat();


        System.out.println("********Test Fish***********");
        Animal myFish = new Fish();
        myFish.label();
        myFish.move();
        myFish.eat();

    }


}