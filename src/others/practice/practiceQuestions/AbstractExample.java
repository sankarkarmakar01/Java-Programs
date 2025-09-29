package others.practice.practiceQuestions;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Ractangle extends Shape {

    private double length;
    private double width;

    public Ractangle(double length,double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return (length * width);
    }

    @Override
    public double perimeter() {
        return (2 * (length * width));
    }
}

class Tringle extends Shape {

    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Tringle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return ((base * height)/2);
    }

    @Override
    public double perimeter() {
        return (side1 + side2 + side3);
    }
}


public class AbstractExample {
    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle(5.1,3.2);
        System.out.println("Area of rectangle: " + ractangle.area());
        System.out.println("Perimeter of rectangle: " + ractangle.perimeter());
        Tringle triangle = new Tringle(4.0, 3.0, 3.0, 4.0, 5.0);
        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Perimeter of triangle: " + triangle.perimeter());
    }
}
