package coreJava.mainJava.codes.operators.relationalOperators.questions;

//Write a program to check if two numbers are equal.

import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Enter the second number: ");
        int b = new Scanner(System.in).nextInt();

        if(a == b) {
            System.out.println("Both are equal numbers.");
        } else {
            System.out.println("Both are not equal numbers.");
        }
    }
}
