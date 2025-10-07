package coreJava.mainJava.codes.dataTypesAndVariables.constants;

//Write a program to create a final class and try to extend it.

final class SubClass {
    void hello() {
        System.out.println("Hello");
    }
}


//public class FinalClass extends SubClass{ //*It's give error because final class can't be inherited
public class FinalClass {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to this world...");
    }
}
