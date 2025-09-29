package coreJava.mainJava.beginnerLevel.dataTypesAndVariables.questions;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();  // initialized by user input
        System.out.println("Your age is: " + age);
    }
}
