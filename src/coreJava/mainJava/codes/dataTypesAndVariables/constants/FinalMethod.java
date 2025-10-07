package coreJava.mainJava.codes.dataTypesAndVariables.constants;

//Write a program to create a final method.

class Another {
    final void greetings() {
        System.out.println("Hello, I am final method.");
    }
    void greetings2() {
        System.out.println("Hello, I am not a final method.");
    }
}

public class FinalMethod extends Another{
    @Override
    void greetings2() {
        System.out.println("Hello, I am Override method.");
    }

//    @Override
//    void greetings() {
//        System.out.println("Error");
//    }

    public static void main(String[] args) {
        new FinalMethod().greetings2();
        new Another().greetings();
        new FinalMethod().greetings();
    }
}
