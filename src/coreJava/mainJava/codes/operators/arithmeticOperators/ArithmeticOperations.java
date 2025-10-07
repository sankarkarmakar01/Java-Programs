package coreJava.mainJava.codes.operators.arithmeticOperators;

//Write a program to perform all arithmetic operations.

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ARITHMETIC OPERATIONS CALCULATOR ===");

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n--- RESULTS ---");

        // Addition
        double sum = num1 + num2;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);

        // Subtraction
        double difference = num1 - num2;
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);

        // Multiplication
        double product = num1 * num2;
        System.out.println("Multiplication: " + num1 + " × " + num2 + " = " + product);

        // Division
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Division: " + num1 + " ÷ " + num2 + " = " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }

        // Modulus (Remainder)
        if (num2 != 0) {
            double remainder = num1 % num2;
            System.out.println("Modulus: " + num1 + " % " + num2 + " = " + remainder);
        } else {
            System.out.println("Modulus: Cannot calculate modulus with zero!");
        }

        // Increment and Decrement
        System.out.println("\n--- INCREMENT/DECREMENT OPERATIONS ---");
        int a = 10;
        int b = 5;

        System.out.println("Original values: a = " + a + ", b = " + b);

        // Post-increment
        System.out.println("Post-increment (a++): " + a++ + " (now a = " + a + ")");

        // Pre-increment
        System.out.println("Pre-increment (++b): " + (++b) + " (now b = " + b + ")");

        // Post-decrement
        System.out.println("Post-decrement (a--): " + a-- + " (now a = " + a + ")");

        // Pre-decrement
        System.out.println("Pre-decrement (--b): " + (--b) + " (now b = " + b + ")");

        // Additional operations
        System.out.println("\n--- ADDITIONAL OPERATIONS ---");

        // Power (using Math.pow)
        double power = Math.pow(num1, num2);
        System.out.println("Power: " + num1 + " ^ " + num2 + " = " + power);

        // Square root
        System.out.println("Square root of " + num1 + " = " + Math.sqrt(num1));
        System.out.println("Square root of " + num2 + " = " + Math.sqrt(num2));

        // Absolute value
        System.out.println("Absolute value of -" + num1 + " = " + Math.abs(-num1));

        scanner.close();
    }
}