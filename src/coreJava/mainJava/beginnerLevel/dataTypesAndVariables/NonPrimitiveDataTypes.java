package coreJava.mainJava.beginnerLevel.dataTypesAndVariables;

import java.util.Arrays;

// class itself a Non-Primitive DataTypes
public class NonPrimitiveDataTypes {

    public static void main(String[] args) {

        // Strings
        String str1 = new String("Sankar"); // Not, It's not used by programmers
        System.out.println(str1);
        String str2 = "Sankar Karmakar";
        System.out.println(str2);

        // Arrays
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(Arrays.toString(arr));

    }

}
