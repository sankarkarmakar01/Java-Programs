package others.dataStructuresAndAlgorithms.coderArmy.Lecture14;

import java.util.Scanner;

public class PrimeCheck {
    static void primeOrNot(int n) {
        if (n < 2) return;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print("Not Prime");
                return;
            }
        }
        System.out.print("Prime");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n'th number:");
        int n = scanner.nextInt();
        primeOrNot(n);
        scanner.close();
    }
}