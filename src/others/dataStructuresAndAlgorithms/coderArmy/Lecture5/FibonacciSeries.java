package others.dataStructuresAndAlgorithms.coderArmy.Lecture5;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the length: ");
        n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= n - 2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        scanner.close();
    }
}
