package coreJava.basics.operators;

public class TernaryOperator {

    public static void main(String[] args) {
        int a = 10, b = 20;

        // ➤ Basic usage: find the smaller value
        int min = (a < b) ? a : b;
        System.out.println("Smaller value between a and b: " + min); // 10

        // ➤ Check if number is even or odd
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result); // 7 is Odd

        // ➤ Check if number is positive, negative or zero (nested ternary)
        int x = -5;
        String status = (x > 0) ? "Positive" : (x < 0) ? "Negative" : "Zero";
        System.out.println("x is " + status); // Negative

        // ➤ Find the maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("Maximum value between a and b: " + max); // 20

        // ➤ Use with boolean value
        boolean isLogin = false;
        String message = isLogin ? "Welcome back!" : "Please log in.";
        System.out.println("Login message: " + message); // Please log in.
    }
}
