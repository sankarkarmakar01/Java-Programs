package coreJava.mainJava.codes.dataTypesAndVariables.nonPremitive;

//Write a program to print all elements of an array.

import java.util.Arrays;

public class PrintArrayElements {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
