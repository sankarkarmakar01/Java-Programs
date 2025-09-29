package others.dataStructuresAndAlgorithms.coderArmy.Lecture5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is: " + fact);
        scanner.close();
    }
}
