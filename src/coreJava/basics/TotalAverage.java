package coreJava.basics;

import java.util.Scanner;

public class TotalAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of five subjects: ");
        int b = sc.nextInt();
        int e = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();
        int g = sc.nextInt();

        int total = b + e + c + p + g;
        float avg = (float) total / 5;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        sc.close();
    }
}
