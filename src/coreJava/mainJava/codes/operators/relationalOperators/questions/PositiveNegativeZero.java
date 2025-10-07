package coreJava.mainJava.codes.operators.relationalOperators.questions;

//Write a program to check if a number is positive, negative, or zero.

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        int num = new Scanner(System.in).nextInt();

        if(num == 0) {
            System.out.println("The number is Zero(0).");
        } else if (num > 0) {
            System.out.println("The number is Positive.");
        } else if (num < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("Please enter a valid input...");
        }
    }
}
