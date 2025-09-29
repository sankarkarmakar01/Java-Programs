package others.practice;

import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("Zero");
        } else if(n > 0) {
            System.out.println("Positive");
        } else if (n<0){
            System.out.println("Negative");
        } else {
            System.out.println("Not a number");
        }
        sc.close();
    }
}
