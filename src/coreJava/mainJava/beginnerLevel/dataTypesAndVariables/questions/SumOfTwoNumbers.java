// Package declaration (optional)
package coreJava.mainJava.beginnerLevel.dataTypesAndVariables.questions;

// Import statements (optional)
import java.util.Scanner;

// Class declaration
public class SumOfTwoNumbers {

    // Main method
    public static void main(String[] args) {

        // Usage of Scanner
        Scanner scanner = new Scanner(System.in);

        // Variable declaration
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Compute sum
        int sum = a + b;

        // Print result
        System.out.println("Sum = " + sum);
    }
}

