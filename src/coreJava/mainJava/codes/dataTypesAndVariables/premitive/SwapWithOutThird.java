package coreJava.mainJava.codes.dataTypesAndVariables.premitive;

//Write a program to swap two numbers without using a third variable.

public class SwapWithOutThird {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
