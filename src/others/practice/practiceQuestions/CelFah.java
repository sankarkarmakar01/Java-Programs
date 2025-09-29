package others.practice.practiceQuestions;

import java.util.Scanner;

public class CelFah {

    double convert(double tem) {
        double ans = 0.0;
        return ((tem * 9) / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CelFah c = new CelFah();
        System.out.print("Enter the Celsius temperature: ");
        double tem = in.nextDouble();
        double fah = c.convert(tem);
        System.out.println("The equivalent Fahrenheit temperature is: " + fah);
    }
}
