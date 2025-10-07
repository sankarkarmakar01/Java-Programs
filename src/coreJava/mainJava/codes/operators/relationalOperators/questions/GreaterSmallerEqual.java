package coreJava.mainJava.codes.operators.relationalOperators.questions;

//Write a program to check if a number is greater, smaller, or equal to another.

import java.util.Scanner;

public class GreaterSmallerEqual {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Enter the second number: ");
        int b = new Scanner(System.in).nextInt();

        if(a == b) {
            System.out.println("Both numbers are equals.");
        } else if (a > b) {
            System.out.println("a is greater then b.");
        } else if (a < b) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("Please enter valid inputs...");
        }
    }
}
