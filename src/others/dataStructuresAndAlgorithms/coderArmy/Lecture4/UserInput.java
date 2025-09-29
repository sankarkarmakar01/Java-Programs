package others.dataStructuresAndAlgorithms.coderArmy.Lecture4;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        System.out.println(a + " " + b);
        scanner.close();
    }
}
