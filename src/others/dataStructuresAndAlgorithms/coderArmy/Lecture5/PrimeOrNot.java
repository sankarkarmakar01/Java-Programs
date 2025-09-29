package others.dataStructuresAndAlgorithms.coderArmy.Lecture5;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = scanner.nextInt();

        if (n == 0 || n == 1) {
            scanner.close();
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                scanner.close();
                return;
            }
        }
        System.out.println("Prime");
        scanner.close();
    }
}
