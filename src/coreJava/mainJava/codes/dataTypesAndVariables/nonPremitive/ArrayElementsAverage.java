package coreJava.mainJava.codes.dataTypesAndVariables.nonPremitive;

//Write a program to calculate the average of array elements.

public class ArrayElementsAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
        }
        System.out.println("Average: " + (add/arr.length));
    }
}
