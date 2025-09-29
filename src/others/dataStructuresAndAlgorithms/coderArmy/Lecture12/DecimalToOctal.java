package others.dataStructuresAndAlgorithms.coderArmy.Lecture12;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        long num = scanner.nextLong();
        long ans = 0, mul = 1;
        int rem;

        while (num != 0) {
            rem = (int)(num % 8);
            num = num / 8;
            ans = ans + (rem * mul);
            mul = mul * 10;
        }
        System.out.println("The octal form is: " + ans);
    }
}