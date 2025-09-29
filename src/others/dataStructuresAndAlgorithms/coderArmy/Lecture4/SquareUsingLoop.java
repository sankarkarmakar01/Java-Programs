package others.dataStructuresAndAlgorithms.coderArmy.Lecture4;

import java.util.Scanner;

public class SquareUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n'th number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
