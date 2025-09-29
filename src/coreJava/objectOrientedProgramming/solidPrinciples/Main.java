package coreJava.objectOrientedProgramming.solidPrinciples;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[] arr = {0,1,2,3,4,5,6,7,8,9};
       int[] arr2 = Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
