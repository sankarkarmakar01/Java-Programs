package DataStructuresAndAlgorithms.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        //array of premitives
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        for ( int i : arr) {
//            System.out.println(i); //[10,20,30,40,50]
//        }
//        System.out.println(arr.length);
//        for(int i = 0;i<arr.length;i++) {
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 0;i<arr.length;i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr[5]);
//        System.out.println(Arrays.toString(arr));

        //Array of Objects

        String[] str = new String[4];
        for(int i = 0;i<str.length;i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));






    }
}
