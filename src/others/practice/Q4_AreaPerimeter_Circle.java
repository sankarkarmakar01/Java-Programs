package others.practice;

//4. Write a Java program to find area and perimeter of a circle.

import java.util.Scanner;

public class Q4_AreaPerimeter_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        float r = sc.nextFloat();
        double area = (22 * r * r)/7;
        double perimeter = (2 *22 * r)/7;
        System.out.println("The Area of the Circle: " + area);
        System.out.println("The Perimeter of the Circle: " + perimeter);
        sc.close();
    }
}
