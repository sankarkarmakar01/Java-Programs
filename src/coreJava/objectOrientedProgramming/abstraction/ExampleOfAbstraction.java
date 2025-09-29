package coreJava.objectOrientedProgramming.abstraction;

public class ExampleOfAbstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.greed();
        c.name();
    }
}

abstract class Vehicle {
    abstract void greed();
    void name() {
        System.out.println("Sankar Karmakar");
    }
}

class Car extends Vehicle {
    @Override
    void greed() {
        System.out.println("I am car");
    }
}
