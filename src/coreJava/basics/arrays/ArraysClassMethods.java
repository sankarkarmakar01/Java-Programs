package coreJava.basics.arrays;

import java.util.Arrays;

public class ArraysClassMethods {
    public static void main(String[] args) {
        // 1. sort()
        int[] arr = {40, 10, 20, 50, 30};
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // 2. fill()
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Array filled with 7s: " + Arrays.toString(filledArray));

        // 3. copyOf()
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // 4. equals()
        boolean isEqual = Arrays.equals(arr, copiedArray);
        System.out.println("Arrays are equal? " + isEqual);

        // 5. binarySearch() (Array must be sorted)
        int key = 30;
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found.");
        }

        // 6. toString()
        System.out.println("Final array representation: " + Arrays.toString(arr));
    }
}
