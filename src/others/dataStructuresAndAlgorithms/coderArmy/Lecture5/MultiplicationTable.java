package others.dataStructuresAndAlgorithms.coderArmy.Lecture5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
        scanner.close();
    }
}
