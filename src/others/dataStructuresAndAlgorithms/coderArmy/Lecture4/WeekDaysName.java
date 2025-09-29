package others.dataStructuresAndAlgorithms.coderArmy.Lecture4;

import java.util.Scanner;

public class WeekDaysName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        System.out.print("Enter the day number(1-7): ");
        day = scanner.nextInt();
        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Please enter a valid input...");
        }
        scanner.close();
    }
}
