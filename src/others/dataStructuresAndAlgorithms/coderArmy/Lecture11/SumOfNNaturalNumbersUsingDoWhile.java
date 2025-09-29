package others.dataStructuresAndAlgorithms.coderArmy.Lecture11;

import java.util.Scanner;

public class SumOfNNaturalNumbersUsingDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int n = scanner.nextInt();
        int i = 1;
        int result = 0;

        do {
            result += i;
            i++;
        } while (i <= n);

        System.out.println("Answer is: " + result);
    }
}