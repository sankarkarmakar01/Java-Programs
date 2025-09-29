package others.dataStructuresAndAlgorithms.coderArmy.Lecture4.Homework;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
        if (a == b) {
            System.out.println("Both are same");
        } else if (a > b) {
            System.out.println("First number is largest");
        } else {
            System.out.println("Second number is largest");
        }
        scanner.close();
    }
}
