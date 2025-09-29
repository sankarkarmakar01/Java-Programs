package others.practice;

import java.util.Scanner;

public class PrimeOrNot {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("Not Prime");
                    break;
                }
                System.out.println("Prime");
                break;
            }
        }
        sc.close();
    }
}
