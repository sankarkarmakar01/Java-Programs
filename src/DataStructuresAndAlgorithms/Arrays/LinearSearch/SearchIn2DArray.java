package DataStructuresAndAlgorithms.Arrays.LinearSearch;
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {24,56,44},
                {66,22,30,85},
                {12,21},
                {52,55,89,99}
        };
        int target = 89;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target) {
        for(int i = 0;i < arr.length;i++) {
            for(int j = 0;j < arr[i].length;j++) {
                if(target == arr[i][j]) {
                    return new int[]{
                            i,j
                    };
                }
            }
        }
        return new int[]{-1,-1};
    }
}
