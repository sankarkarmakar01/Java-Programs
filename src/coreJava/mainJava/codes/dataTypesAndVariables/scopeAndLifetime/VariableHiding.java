package coreJava.mainJava.codes.dataTypesAndVariables.scopeAndLifetime;

//Write a program where a variable inside a method hides a global variable.

public class VariableHiding {
    // Global (class-level) variable
    private static int globalValue = 100;

    public void demonstrateHiding() {
        // Local variable inside method hides the global variable
        int globalValue = 200;

        System.out.println("Local variable (hiding global): " + globalValue);  // Outputs: 200

        // To access the global variable, qualify it with the class name
        System.out.println("Global variable value: " + VariableHiding.globalValue);  // Outputs: 100
    }

    public static void main(String[] args) {
        VariableHiding example = new VariableHiding();
        example.demonstrateHiding();
    }
}