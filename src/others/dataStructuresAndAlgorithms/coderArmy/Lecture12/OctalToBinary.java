package others.dataStructuresAndAlgorithms.coderArmy.Lecture12;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the octal number: ");
        long num = scanner.nextLong();
        long ans = 0, mul = 1;

        while (num != 0) {
            int rem = (int)(num % 10);
            num = num / 10;
            ans = ans + (rem * mul);
            mul = mul * 8;
        }

        long binary = 0, place = 1;
        long decimal = ans;

        while (decimal != 0) {
            int rem = (int)(decimal % 2);
            decimal = decimal / 2;
            binary = binary + (rem * place);
            place = place * 10;
        }
        System.out.println("The binary form is: " + binary);
    }
}