package others.dataStructuresAndAlgorithms.coderArmy.Lecture11;

import java.util.Scanner;

public class PrintEvenInRangeUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int n = scanner.nextInt();
        int i = 1;

        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}