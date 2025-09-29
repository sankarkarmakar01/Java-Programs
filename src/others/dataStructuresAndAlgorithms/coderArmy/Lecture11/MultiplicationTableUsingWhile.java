package others.dataStructuresAndAlgorithms.coderArmy.Lecture11;

import java.util.Scanner;

public class MultiplicationTableUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }
    }
}