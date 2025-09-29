package others.practice.practiceQuestions;

import java.util.Scanner;

public class AreaPerimeter {

    double area(double radius) {
        return (22 * radius * radius)/7;
    }

    double perimeter(double radius) {
        return (2 * 22 * radius)/7;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AreaPerimeter obj = new AreaPerimeter();
        System.out.print("Enter radius of the circle: ");
        double radius = in.nextDouble();
        double area = obj.area(radius);
        double perimeter = obj.perimeter(radius);
        System.out.println("Area of this circle is: " + area);
        System.out.println("Perimeter of this circle is: " + perimeter);
    }
}
