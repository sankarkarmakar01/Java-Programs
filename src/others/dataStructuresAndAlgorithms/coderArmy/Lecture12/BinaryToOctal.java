package others.dataStructuresAndAlgorithms.coderArmy.Lecture12;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        long num = scanner.nextLong();
        long ans = 0, mul = 1;
        long n, a = 0, m = 1;
        int rem, r;

        while (num != 0) {
            rem = (int)(num % 10);
            num = num / 10;
            ans = ans + (rem * mul);
            mul = mul * 2;
        }

        n = ans;
        while (n != 0) {
            r = (int)(n % 8);
            n = n / 8;
            a += r * m;
            m *= 10;
        }
        System.out.println("The octal form is: " + a);
    }
}