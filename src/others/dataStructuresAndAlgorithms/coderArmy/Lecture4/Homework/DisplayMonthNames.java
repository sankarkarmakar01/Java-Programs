package others.dataStructuresAndAlgorithms.coderArmy.Lecture4.Homework;

import java.util.Scanner;

public class DisplayMonthNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number(1-12): ");
        n = scanner.nextInt();
        if (n >= 1 && n <= 12) {
            if (n == 1) {
                System.out.println("January");
            } else if (n == 2) {
                System.out.println("February");
            } else if (n == 3) {
                System.out.println("March"); // Corrected typo from "Merch"
            } else if (n == 4) {
                System.out.println("April");
            } else if (n == 5) {
                System.out.println("May");
            } else if (n == 6) {
                System.out.println("June");
            } else if (n == 7) {
                System.out.println("July");
            } else if (n == 8) {
                System.out.println("August");
            } else if (n == 9) {
                System.out.println("September"); // Corrected typo from "Septmeber"
            } else if (n == 10) {
                System.out.println("October");
            } else if (n == 11) {
                System.out.println("November");
            } else if (n == 12) {
                System.out.println("December");
            }
        } else {
            System.out.println("Enter valid input");
        }
        scanner.close();
    }
}
