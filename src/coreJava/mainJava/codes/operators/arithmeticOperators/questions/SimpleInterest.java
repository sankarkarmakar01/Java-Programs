package coreJava.mainJava.codes.operators.arithmeticOperators.questions;

//Write a program to find the simple interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.print("Enter Principal amount(in Integer/Double): ");
        double principle = new Scanner(System.in).nextDouble();
        System.out.print("Enter Annual Rate(in Percentage): ");
        double rate = new Scanner(System.in).nextDouble();
        System.out.print("Enter Time period(in Years): ");
        int time = new Scanner(System.in).nextInt();

        double simpleInterest = (principle * rate * time)/100;

        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
