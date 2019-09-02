package oop.concept.Encapsulation;

import jdk.swing.interop.SwingInterOpUtils;

public class Execution {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();

        myAnimal.setName("DOG");
        myAnimal.setAverageWeight(10.5);
        myAnimal.setNumberofLegs(4);

        System.out.println("Name: "+ myAnimal.getName());
        System.out.println("AverageWeight: " + myAnimal.getAverageWeight() + "lbs");
        System.out.println("Number of legs: " + myAnimal.getNumberofLegs());

    }
}
