package others.practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n + " is a Even number");
        } else  {
            System.out.println(n + " is a Odd number");
        }
        sc.close();
    }
}
