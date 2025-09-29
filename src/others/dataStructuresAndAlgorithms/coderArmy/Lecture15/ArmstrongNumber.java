package others.dataStructuresAndAlgorithms.coderArmy.Lecture15;

import java.util.Scanner;

public class ArmstrongNumber {
    static void armstrong(int n) {
        int rem, temp, num, count = 0, ans = 0;
        num = temp = n;

        while (n != 0) {
            rem = n % 10;
            count++;
            n /= 10;
        }

        while (num != 0) {
            rem = num % 10;
            ans += Math.pow(rem, count);
            num /= 10;
        }

        if (temp == ans) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        armstrong(n);
        scanner.close();
    }
}