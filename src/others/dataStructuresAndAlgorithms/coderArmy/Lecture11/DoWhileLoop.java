package others.dataStructuresAndAlgorithms.coderArmy.Lecture11;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int n = scanner.nextInt();
        int i = 1;

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
    }
}