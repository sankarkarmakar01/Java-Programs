package javaRevision.controlFlow;

public class ReturnExample {
    static void main(String[] args) {
        System.out.println("Start of main");
        greet();
        System.out.println("End of main");
    }

    static void greet() {
        System.out.println("Hello!");
        return; // exits the method
        // System.out.println("This won't execute"); // unreachable
    }
}

