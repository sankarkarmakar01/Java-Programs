package coreJava.basics.controlFlow;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Using do-while loop:");
        int i = 1;
        do {
            System.out.println("Count: " + i);
            i++;
        } while (i <= 5);
    }
}
