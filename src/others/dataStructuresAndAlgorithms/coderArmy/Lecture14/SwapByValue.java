package others.dataStructuresAndAlgorithms.coderArmy.Lecture14;

import java.util.Scanner;

public class SwapByValue {
    static void swapPassByValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After:-");
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int a = scanner.nextInt();
        System.out.print("Enter the second number:");
        int b = scanner.nextInt();

        System.out.println("Before:-");
        System.out.println(a + " " + b);

        swapPassByValue(a, b);
        scanner.close();
    }
}