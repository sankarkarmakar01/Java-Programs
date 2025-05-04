package DataStructuresAndAlgorithms.Arrays;

public class MaxOverAll {

    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 7, 55};
        int ans = arr[0];
        for (int j : arr) {
            if (ans < j) {
                ans = j;
            }
        }
        System.out.println(ans);
    }
}
