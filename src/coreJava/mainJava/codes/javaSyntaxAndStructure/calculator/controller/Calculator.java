package coreJava.mainJava.codes.javaSyntaxAndStructure.calculator.controller;

//Create a simple class named Calculator inside a package and call its methods from another class.


public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
       if(b == 0) {
           System.out.println("Not Possible...");
          return 0;
       }
       return a / b;
    }

    public int module(int a, int b) {
        if(b == 0) {
            System.out.println("Not Possible...");
            return 0;
        }
        return a % b;
    }
}
