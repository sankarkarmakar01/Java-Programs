package others.dataStructuresAndAlgorithms.coderArmy.Lecture5.HomeWork;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = scanner.nextInt();

        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("N'th fibonacci number is: " + c);
        scanner.close();
    }
}
