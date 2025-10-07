package coreJava.mainJava.codes.operators.arithmeticOperators.questions;

//Write a program to find the area and perimeter of a rectangle.

import java.util.Scanner;

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        System.out.print("Enter the length of the rectangle: ");
        double length = new Scanner(System.in).nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.println("Area: " + (length * width));
        System.out.println("Perimeter: " + (2*(length + width)));
    }
}
