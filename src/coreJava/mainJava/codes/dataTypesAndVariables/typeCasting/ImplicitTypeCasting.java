package coreJava.mainJava.codes.dataTypesAndVariables.typeCasting;

//Write a program to demonstrate implicit (widening) type casting.

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        int integerValue = 10;
        double doubleValue = 3.14;
        double result = integerValue + doubleValue;

        // Manually specify the types
        System.out.println("Integer value: " + integerValue + " (type: int)");
        System.out.println("Double value: " + doubleValue + " (type: double)");
        System.out.println("Result of addition: " + result + " (type: double)");
    }
}
