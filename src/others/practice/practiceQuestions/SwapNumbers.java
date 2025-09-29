package others.practice.practiceQuestions;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();
        int temp = first;
        first = second;
        second = temp;
        System.out.println("The first number is: " + first);
        System.out.println("The second number is: " + second);
    }
}
