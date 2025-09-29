package coreJava.basics;

public class Functions {
    static void greet() {
        System.out.println("Hello, my name is Sankar Karmakar");
    }

    void greet2() {
        System.out.println("Hello, Welcome to this entire cursed world...");
    }
    public static void main(String[] args) {
        Functions functions = new Functions();
        greet();
        functions.greet2();
    }
}
