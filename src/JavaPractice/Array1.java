package JavaPractice;

import java.util.*;

public class Array1 {
    public static void main(String[] args) {
//        int[] arr = new int[10];
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
