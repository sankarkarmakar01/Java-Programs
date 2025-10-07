package coreJava.mainJava.codes.dataTypesAndVariables.nonPremitive;

//Write a program to find the largest and smallest element in an array.

public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = {12,52,1,10,45,63,35};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
