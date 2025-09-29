package others.dataStructuresAndAlgorithms.coderArmy.Lecture14;

import java.util.Scanner;

public class FactorialUsingMethod {
    static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.print("Factorial is: " + fact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n'th number:");
        int n = scanner.nextInt();
        factorial(n);
        scanner.close();
    }
}