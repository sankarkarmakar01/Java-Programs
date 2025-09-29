package others.practice;

//8. Write a Java program to swap two numbers.

import java.util.Scanner;

public class Q8_Swap_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Before Swap...");
        System.out.println("First: " + a);
        System.out.println("Second: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap...");
        System.out.println("First: " + a);
        System.out.println("Second: " + b);
        sc.close();
    }
}
