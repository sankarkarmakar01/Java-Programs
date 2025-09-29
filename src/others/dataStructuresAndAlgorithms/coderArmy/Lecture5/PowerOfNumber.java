package others.dataStructuresAndAlgorithms.coderArmy.Lecture5;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, power;
        System.out.print("Enter the number: ");
        num = scanner.nextInt();
        System.out.print("Enter the power: ");
        power = scanner.nextInt();
        int ans = 1;
        for (int i = 1; i <= power; i++) {
            ans = ans * num;
        }
        System.out.println("Answer: " + ans);
        scanner.close();
    }
}
