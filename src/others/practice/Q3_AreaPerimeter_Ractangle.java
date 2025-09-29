package others.practice;

//3. Write a Java program to find area and perimeter of a rectangle.

import java.util.Scanner;

public class Q3_AreaPerimeter_Ractangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        float l = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        float b = sc.nextFloat();
        double area = l * b;
        double perimeter = 2 * (l + b);
        System.out.println("The Area of the Rectangle: " + area);
        System.out.println("The Perimeter of the Rectangle: " + perimeter);
        sc.close();
    }
}
