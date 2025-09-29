package others.dataStructuresAndAlgorithms.coderArmy.Lecture4.Homework;

import java.util.Scanner;

public class DivisibleBy4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the n'th number: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
