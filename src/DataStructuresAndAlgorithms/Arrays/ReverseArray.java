package DataStructuresAndAlgorithms.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int start = 0;
        int end = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }
        System.out.println(Arrays.toString(arr));
    }
}
