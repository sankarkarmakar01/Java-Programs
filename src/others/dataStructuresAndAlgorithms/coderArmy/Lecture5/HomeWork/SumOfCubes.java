package others.dataStructuresAndAlgorithms.coderArmy.Lecture5.HomeWork;

import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += (i * i * i);
        }
        System.out.println("Answer: " + ans);
        scanner.close();
    }
}
