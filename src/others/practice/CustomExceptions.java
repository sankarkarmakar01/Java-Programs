package others.practice;

import java.util.Scanner;

public class CustomExceptions {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");

        try {
            int age = sc.nextInt();

            if (age > 100) {
                // throw new MyException("My error is this");
                throw new ArithmeticException("More then 100 not allowed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

}