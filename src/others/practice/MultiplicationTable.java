package others.practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            int ans = n * i;
            System.out.println(n + " * " + i + " = " + ans);
        }
        sc.close();
    }
}
