package others.dataStructuresAndAlgorithms.coderArmy.Lecture14;

import java.util.Scanner;

public class SumOfTwo {
    static int sumOfTwo(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = scanner.nextInt();
        System.out.print("Enter the second number:");
        int b = scanner.nextInt();
        System.out.print("Sum: " + sumOfTwo(a, b));
        scanner.close();
    }
}