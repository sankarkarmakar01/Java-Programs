package coreJava.mainJava.codes.dataTypesAndVariables.typeCasting;

//Write a program to demonstrate explicit (narrowing) type casting.

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        System.out.println("=== EXPLICIT (NARROWING) TYPE CASTING DEMONSTRATION ===\n");

        // 1. double to int casting (loss of decimal part)
        System.out.println("1. double to int casting:");
        double doubleValue = 123.789;
        int intValue = (int) doubleValue;  // Explicit casting
        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting to int: " + intValue);
        System.out.println("Data lost: " + (doubleValue - intValue));
        System.out.println();

        // 2. long to int casting (possible overflow)
        System.out.println("2. long to int casting:");
        long longValue = 2147483648L;  // This is 2^31 (max int + 1)
        int intFromLong = (int) longValue;  // Explicit casting
        System.out.println("Original long value: " + longValue);
        System.out.println("After casting to int: " + intFromLong);
        System.out.println("Overflow occurred due to limited int range (-2^31 to 2^31-1)");
        System.out.println();

        // 3. int to byte casting (data truncation)
        System.out.println("3. int to byte casting:");
        int largeInt = 300;
        byte byteValue = (byte) largeInt;  // Explicit casting
        System.out.println("Original int value: " + largeInt);
        System.out.println("After casting to byte: " + byteValue);
        System.out.println("Byte range: -128 to 127");
        System.out.println();

        // 4. float to int casting
        System.out.println("4. float to int casting:");
        float floatValue = 456.99f;
        int intFromFloat = (int) floatValue;  // Explicit casting
        System.out.println("Original float value: " + floatValue);
        System.out.println("After casting to int: " + intFromFloat);
        System.out.println();

        // 5. double to float casting (precision loss)
        System.out.println("5. double to float casting:");
        double preciseDouble = 3.141592653589793;
        float floatFromDouble = (float) preciseDouble;  // Explicit casting
        System.out.println("Original double value: " + preciseDouble);
        System.out.println("After casting to float: " + floatFromDouble);
        System.out.println("Precision lost in decimal places");
        System.out.println();

        // 6. char to int and back (ASCII values)
        System.out.println("6. char to int and back:");
        char charValue = 'A';
        int charToInt = (int) charValue;  // char to int (ASCII value)
        char intToChar = (char) (charToInt + 1);  // int to char
        System.out.println("Original char: " + charValue);
        System.out.println("Char to int (ASCII): " + charToInt);
        System.out.println("Int to char (next character): " + intToChar);
        System.out.println();

        // 7. Multiple explicit casts in expressions
        System.out.println("7. Multiple explicit casts in expressions:");
        double d1 = 100.5;
        double d2 = 200.7;
        int result = (int) d1 + (int) d2;  // Casting before addition
        System.out.println("(int)" + d1 + " + (int)" + d2 + " = " + result);
        System.out.println("Note: Each value is cast separately before addition");
        System.out.println();

        // 8. Demonstrating when explicit casting is necessary
        System.out.println("8. Necessary explicit casting scenarios:");

        // Scenario 1: Division with integers expecting double result
        int a = 5;
        int b = 2;
        double division1 = a / b;  // No casting - integer division
        double division2 = (double) a / b;  // Explicit casting - proper division
        System.out.println("Without casting: " + a + " / " + b + " = " + division1);
        System.out.println("With casting: (double)" + a + " / " + b + " = " + division2);
        System.out.println();

        // 9. Summary of data type sizes and ranges
        System.out.println("9. Data Type Ranges (Java):");
        System.out.println("byte:  -128 to 127");
        System.out.println("short: -32,768 to 32,767");
        System.out.println("int:   -2,147,483,648 to 2,147,483,647");
        System.out.println("long:  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println("float:  approximately ±3.40282347E+38F (6-7 significant decimal digits)");
        System.out.println("double: approximately ±1.79769313486231570E+308 (15 significant decimal digits)");
    }
}
