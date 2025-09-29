package others.practice;

//5. Write a Java Program to display whether a number is odd or even.

import java.util.Scanner;

public class Q5_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any integer number: ");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("It is Zero...");
        }else if(n < 0){
            System.out.println("It is a Negative Number...");
        } else {
            if(n % 2 == 0) {
                System.out.println(n + " is a Even Number");
            } else {
                System.out.println(n + " is a Odd Number");
            }
        }
        sc.close();
    }
}
