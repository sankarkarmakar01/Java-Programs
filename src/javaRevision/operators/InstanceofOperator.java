package javaRevision.operators;

// Parent class
class Animal {}

// Subclass
class Dog extends Animal {}

// Another subclass
class Cat extends Animal {}

// Interface
interface Pet {}
class Parrot extends Animal implements Pet {}

public class InstanceofOperator {

    static void main(String[] args) {
        Animal a = new Dog();   // Upcasting
        Dog d = new Dog();
        Cat c = new Cat();
        Parrot p = new Parrot();
        Animal unknown = null;

        // ➤ Check exact instance
        System.out.println("d instanceof Dog: " + (d instanceof Dog)); // true

        // ➤ Check subclass is instance of superclass
        System.out.println("d instanceof Animal: " + (d instanceof Animal)); // true

        // ➤ Check unrelated type
        System.out.println("d instanceof Dog: " + (d instanceof Dog)); // false

        // ➤ Check interface implementation
        System.out.println("p instanceof Pet: " + (p instanceof Pet)); // true

        // ➤ Check subclass casted to superclass
        System.out.println("a instanceof Dog: " + (a instanceof Dog)); // true

        // ➤ instanceof with null (always false)
        System.out.println("unknown instanceof Animal: " + (unknown instanceof Animal)); // false
    }
}
