package others.dataStructuresAndAlgorithms.coderArmy.Lecture5;

import java.util.Scanner;

public class DisplayNumberInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the last number: ");
        n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
