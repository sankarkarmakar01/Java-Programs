package others.dataStructuresAndAlgorithms.coderArmy.Lecture4.Homework;

import java.util.Scanner;

public class TicketDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        if (age < 12 || age > 65) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
