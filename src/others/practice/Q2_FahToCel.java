package others.practice;

//2. Write a Java program to change temperature from Fahrenheit to Celsius.

import java.util.Scanner;

public class Q2_FahToCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit Temperature: ");
        float fah = sc.nextFloat();
        float c = (5 * (fah - 32)) / 9;
        System.out.println("The Celsius Temperature is: " + c);
        sc.close();
    }
}
