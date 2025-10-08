package others.dataStructuresAndAlgorithms.striversA2ZDSA.recursion;

import java.util.Scanner;

public class DisplayNumberLinearly {

    static void printNumbers(int i, int n) {
        if(i > n) {
            return;
        }
        System.out.println(i);
        printNumbers(i + 1,n);
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = new Scanner(System.in).nextInt();
        printNumbers(1,n);
    }
}
