package coreJava.objectOrientedProgramming.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int cal = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("The Exception is: " + e);
        }
        catch (Exception e) {
            System.out.println("The Exception is: " + e);
        }
        finally {
            System.out.println("The program will be continued...");
        }
    }
}
