package coreJava.mainJava.codes.dataTypesAndVariables.scopeAndLifetime;

//Write a program to demonstrate local, instance, and static variables.

public class VariableScope {
    // Static variable - belongs to the class
    static String className = "VariableDemo Class";
    static int objectCount = 0;

    // Instance variables - belong to each object
    String objectName;
    int objectId;

    // Constructor
    public VariableScope(String name) {
        // Local variable - exists only within constructor
        String greeting = "Creating object: ";
        System.out.println(greeting + name);

        this.objectName = name;
        this.objectId = ++objectCount; // Using static variable
    }

    // Method demonstrating local variables
    public void displayInfo() {
        // Local variable - exists only within this method
        String message = "Object Information: ";
        System.out.println(message);
        System.out.println("Class: " + className);        // Static variable
        System.out.println("Name: " + objectName);        // Instance variable
        System.out.println("ID: " + objectId);            // Instance variable
        System.out.println("Total Objects: " + objectCount); // Static variable
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        // Display static variable directly (no object needed)
        System.out.println("Class Name: " + VariableScope.className);
        System.out.println("Initial Object Count: " + VariableScope.objectCount);
        System.out.println("===============");

        // Create objects
        VariableScope obj1 = new VariableScope("First Object");
        VariableScope obj2 = new VariableScope("Second Object");
        VariableScope obj3 = new VariableScope("Third Object");

        // Display information using instance method
        obj1.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();

        // Show static variable is shared across all objects
        System.out.println("Final Object Count (from class): " + VariableScope.objectCount);
        System.out.println("Final Object Count (from obj1): " + obj1.objectCount);
        System.out.println("Final Object Count (from obj2): " + obj2.objectCount);
    }
}