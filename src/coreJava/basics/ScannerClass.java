package coreJava.basics;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = sc.nextLine();
        System.out.println("Hello " + s);
        sc.close();
    }
}
