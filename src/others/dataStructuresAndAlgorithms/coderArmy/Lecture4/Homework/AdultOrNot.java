package others.dataStructuresAndAlgorithms.coderArmy.Lecture4.Homework;

import java.util.Scanner;

public class AdultOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        if (age > 18) {
            System.out.println("You are Adult");
        } else {
            System.out.println("You are Not Adult");
        }
        scanner.close();
    }
}
