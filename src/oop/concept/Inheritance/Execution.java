package oop.concept.Inheritance;

public class Execution {

    public static void main(String[] args) {

        Son mySon = new Son();

        System.out.println("Name: " + mySon.name);
        System.out.println("Age: " + mySon.age);
        System.out.println("Country: " + mySon.countryFrom);
        System.out.println("Home Town: " + mySon.homeTwon);
        mySon.likeTodo();
        mySon.job();
    }

}
