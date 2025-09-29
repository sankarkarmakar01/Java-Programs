package others.practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("Enter n'th number:");
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n-2;i++){
            int c = a + b;
            System.out.println(c);
            a=b;
            b=c;
        }
        sc.close();
    }
}
