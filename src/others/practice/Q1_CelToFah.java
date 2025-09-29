package others.practice;

//1. Write a Java program to change temperature from Celsius to Fahrenheit.

import java.util.Scanner;

public class Q1_CelToFah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius Temperature: ");
        float cel = sc.nextFloat();
        float f = (cel * 9)/5 + 32;
        System.out.println("The Fahrenheit Temperature is: " + f);
        sc.close();
    }
}
