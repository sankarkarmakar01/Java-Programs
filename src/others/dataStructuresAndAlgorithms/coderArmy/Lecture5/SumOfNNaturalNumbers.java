package others.dataStructuresAndAlgorithms.coderArmy.Lecture5;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println("Answer: " + ans);
        scanner.close();
    }
}
