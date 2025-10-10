package others.dataStructuresAndAlgorithms.striversA2ZDSA.recursion;

import java.util.Scanner;

public class DisplayNumbersInReverse {
    static void printNumberReverse(int i, int n) {
        if(i < 1) {
            return;
        }
        System.out.println(i);
        printNumberReverse(i - 1,n);
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = new Scanner(System.in).nextInt();
        printNumberReverse(n,n);
    }
}
