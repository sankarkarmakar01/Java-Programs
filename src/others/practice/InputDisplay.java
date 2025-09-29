package others.practice;

import java.util.Scanner;

public class InputDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number(Integer):");
        int num = sc.nextInt();
        System.out.println("The number is:" + num);
        sc.close();
    }
}
