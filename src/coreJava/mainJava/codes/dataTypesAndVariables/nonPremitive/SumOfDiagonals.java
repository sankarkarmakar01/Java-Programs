package coreJava.mainJava.codes.dataTypesAndVariables.nonPremitive;

//Write a program to find the sum of diagonal elements of a 2D array.

public class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        int temp = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            firstDiagonalSum += arr[i][i];
            secondDiagonalSum += arr[i][temp];
            temp--;
        }
        System.out.println("First diagonal sum: " + firstDiagonalSum);
        System.out.println("Second diagonal sum: " + secondDiagonalSum);

    }
}
