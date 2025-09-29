package others.dataStructuresAndAlgorithms.coderArmy.Lecture9;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n = scanner.nextInt();

        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = 1; col <= 2 * n - 2 * row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = 1; col <= 2 * n - 2 * row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}