package coreJava.mainJava.codes.javaSyntaxAndStructure.calculator;

import coreJava.mainJava.codes.javaSyntaxAndStructure.calculator.controller.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(10,20));
        System.out.println(calculator.subtraction(55,9));
        System.out.println(calculator.multiplication(10,8));
        System.out.println(calculator.division(10,5));
        System.out.println(calculator.module(10,3));
    }
}
