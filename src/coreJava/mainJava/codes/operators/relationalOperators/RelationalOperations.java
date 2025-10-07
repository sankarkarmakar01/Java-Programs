package coreJava.mainJava.codes.operators.relationalOperators;

//Write a program to perform all relational operations.

import java.util.Scanner;

public class RelationalOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== RELATIONAL OPERATIONS DEMONSTRATION ===");

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("\nNumbers: " + num1 + " and " + num2);
        System.out.println("--- RELATIONAL OPERATIONS RESULTS ---");

        // Equal to (==)
        boolean isEqual = (num1 == num2);
        System.out.println(num1 + " == " + num2 + " : " + isEqual);

        // Not equal to (!=)
        boolean notEqual = (num1 != num2);
        System.out.println(num1 + " != " + num2 + " : " + notEqual);

        // Greater than (>)
        boolean greaterThan = (num1 > num2);
        System.out.println(num1 + " > " + num2 + " : " + greaterThan);

        // Less than (<)
        boolean lessThan = (num1 < num2);
        System.out.println(num1 + " < " + num2 + " : " + lessThan);

        // Greater than or equal to (>=)
        boolean greaterThanOrEqual = (num1 >= num2);
        System.out.println(num1 + " >= " + num2 + " : " + greaterThanOrEqual);

        // Less than or equal to (<=)
        boolean lessThanOrEqual = (num1 <= num2);
        System.out.println(num1 + " <= " + num2 + " : " + lessThanOrEqual);

        // String comparison
        System.out.println("\n--- STRING COMPARISON ---");
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        System.out.println("Strings: str1 = \"" + str1 + "\", str2 = \"" + str2 + "\", str3 = \"" + str3 + "\"");

        // String equality (content comparison)
        boolean stringEqual1 = str1.equals(str2);
        boolean stringEqual2 = str1.equals(str3);
        System.out.println("str1.equals(str2) : " + stringEqual1);
        System.out.println("str1.equals(str3) : " + stringEqual2);

        // String reference comparison
        boolean referenceEqual = (str1 == str3);
        System.out.println("str1 == str3 : " + referenceEqual);

        // Character comparison
        System.out.println("\n--- CHARACTER COMPARISON ---");
        char char1 = 'A';
        char char2 = 'B';
        char char3 = 'A';

        System.out.println("Characters: '" + char1 + "', '" + char2 + "', '" + char3 + "'");
        System.out.println(char1 + " == " + char2 + " : " + (char1 == char2));
        System.out.println(char1 + " == " + char3 + " : " + (char1 == char3));
        System.out.println(char1 + " < " + char2 + " : " + (char1 < char2));

    }
}