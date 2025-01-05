package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class BinaryToDecimal {
    public long BinaryToDecimalMethod(long num) {
        long ans = 0;
        int mul = 1;
        while (num > 0) {
            long rem = num % 10;
            num /= 10;
            ans += rem * mul;
            mul *= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        BinaryToDecimal b = new BinaryToDecimal();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number: ");
        long bin = sc.nextLong();
        long ans = b.BinaryToDecimalMethod(bin);
        System.out.println("The decimal number is: " + ans);
        sc.close();
    }
}
