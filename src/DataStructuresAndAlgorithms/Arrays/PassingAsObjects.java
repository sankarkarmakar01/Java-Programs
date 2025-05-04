package DataStructuresAndAlgorithms.Arrays;

import java.util.Arrays;

public class PassingAsObjects {
    public static void main(String[] args) {
        int[] arr = {3,5,9,7};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr) {
        arr[0] = 99;
    }
}
