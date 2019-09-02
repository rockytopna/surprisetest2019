package oop.concept.Encapsulation;

public class Animal {

    private String name;
    private double averageWeight;
    private int numberofLegs;

    //Getter Methods


    public String getName() {
        return name;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public int getNumberofLegs() {
        return numberofLegs;
    }

    //Setter Methods


    public void setName(String name) {
        this.name = name;
    }

    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void setNumberofLegs(int numberofLegs) {
        this.numberofLegs = numberofLegs;
    }
}

