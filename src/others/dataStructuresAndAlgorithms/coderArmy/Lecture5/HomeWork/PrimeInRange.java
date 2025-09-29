package others.dataStructuresAndAlgorithms.coderArmy.Lecture5.HomeWork;

import java.util.Scanner;

public class PrimeInRange {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the last number: ");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
