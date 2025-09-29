package others.practice;

//6. Write a Java Program to check if a number is Positive or Negative.

import java.util.Scanner;

public class Q6_PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("It is Zero...");
        } else if (n > 0) {
            System.out.println("It is a Positive Number");
        } else {
            System.out.println("It is a Negative Number");
        }
        sc.close();
    }
}
