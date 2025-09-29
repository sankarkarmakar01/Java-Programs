package others.practice;

import java.util.Scanner;

public class GreaterBetweenTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }
        sc.close();
    }
}
