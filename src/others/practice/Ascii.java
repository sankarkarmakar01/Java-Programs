package others.practice;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character:");
        char ch = sc.next().trim().charAt(0);
        int asc = (int)(ch);
        System.out.println(asc);
        sc.close();
    }
}
