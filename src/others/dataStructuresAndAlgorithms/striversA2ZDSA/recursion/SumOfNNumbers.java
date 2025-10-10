package others.dataStructuresAndAlgorithms.striversA2ZDSA.recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    static long sumOfN(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumOfN(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Sum of N numbers: " + sumOfN(n));
    }
}
