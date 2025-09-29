package others.practice;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n'th number:");
        int n = sc.nextInt();
        long ans = (n*(n+1))/2;
        System.out.println("The sum is: " + ans);
        sc.close();
    }
}
