package others.practice.practiceQuestions;

import java.util.Scanner;

public class LeapYear {
    String isLeapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return "It's a leap year";
        }
        return "It's not a leap year";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LeapYear obj = new LeapYear();
        System.out.print("Enter the year: ");
        int year = in.nextInt();
        String ans = obj.isLeapYear(year);
        System.out.println(ans);
    }
}
