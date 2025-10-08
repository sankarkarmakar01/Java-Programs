package others.dataStructuresAndAlgorithms.striversA2ZDSA.recursion;

import java.util.Scanner;

public class DisplayNameNTimes {

    static void printName(int i, int n) {
        if(i > n) {
            return;
        }
        System.out.println("Sankar");
        printName(i +1,n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        printName(1,n);
    }
}
