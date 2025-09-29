package others.dataStructuresAndAlgorithms.coderArmy.Lecture12;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        long num = scanner.nextLong();
        long ans = 0, mul = 1;
        int rem;

        while (num != 0) {
            rem = (int)(num % 10);
            num = num / 10;
            ans = ans + (rem * mul);
            mul = mul * 2;
        }
        System.out.println("The decimal form is: " + ans);
    }
}