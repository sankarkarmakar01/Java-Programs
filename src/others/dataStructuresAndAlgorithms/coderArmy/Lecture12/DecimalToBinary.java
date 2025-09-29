package others.dataStructuresAndAlgorithms.coderArmy.Lecture12;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        long num = scanner.nextLong();
        long ans = 0, mul = 1;
        int rem;

        while (num != 0) {
            rem = (int)(num % 2);
            num = num / 2;
            ans = ans + (rem * mul);
            mul = mul * 10;
        }
        System.out.println("The Binary form is: " + ans);
    }
}