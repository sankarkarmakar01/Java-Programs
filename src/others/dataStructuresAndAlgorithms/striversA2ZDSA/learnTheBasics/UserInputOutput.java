package others.dataStructuresAndAlgorithms.striversA2ZDSA.learnTheBasics;

import java.util.Scanner;

public class UserInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, Mr. " + name);
    }
}
