package others.dataStructuresAndAlgorithms.coderArmy.Lecture14;

import java.util.Scanner;

public class SumOfN {
    static void sumOfN(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.print("Sum of numbers is: " + ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n'th number:");
        int n = scanner.nextInt();
        sumOfN(n);
        scanner.close();
    }
}