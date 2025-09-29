package others.practice;

//7. Write a Java program to find maximum of three numbers.

import java.util.Scanner;

public class Q7_MAX_Of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.println(a + " is Maximum number");
        } else if (b > a && b > c) {
            System.out.println(b + " is Maximum number");
        } else {
            System.out.println(c + " is Maximum number");
        }
        sc.close();
    }
}
