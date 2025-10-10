package others.dataStructuresAndAlgorithms.striversA2ZDSA.recursion;

import java.util.Scanner;

public class FactorialOfN {
    static long factorialOfN(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorialOfN(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Factorial : " + factorialOfN(n));
    }
}
