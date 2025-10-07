package coreJava.mainJava.codes.dataTypesAndVariables.scopeAndLifetime;

//Write a program to show how variable shadowing works in Java.

public class VariableShadowing {
    // Instance variable
    private int value = 10;
    public void demonstrateShadowing() {
        // Local variable shadowing the instance variable
        int value = 20;

        System.out.println("Local variable value: " + value);  // Outputs: 20

        // To access the instance variable, use 'this'
        System.out.println("Instance variable value: " + this.value);  // Outputs: 10
    }

    public static void main(String[] args) {
        VariableShadowing example = new VariableShadowing();
        example.demonstrateShadowing();
    }
}