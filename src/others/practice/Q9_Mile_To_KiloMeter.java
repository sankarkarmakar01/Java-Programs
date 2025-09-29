package others.practice;

//9. Write a Java program to convert miles to kilometers.

import java.util.Scanner;

public class Q9_Mile_To_KiloMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in miles: ");
        double mile = sc.nextDouble();
        System.out.println("The distance in kilometer is: " + (mile * 1.609344));
        sc.close();
    }
}
