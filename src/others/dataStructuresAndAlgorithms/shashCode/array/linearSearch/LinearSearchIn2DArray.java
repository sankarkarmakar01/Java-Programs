package others.dataStructuresAndAlgorithms.shashCode.array.linearSearch;

public class LinearSearchIn2DArray {

    public void linearSearchIn2D(int[][] arr, int target, boolean findLast) {
        int outerIndex = -1;
        int innerIndex = -1;
        for(int i = 0;i<arr.length;i++) {
            boolean found = false;
            for(int j = 0;j<arr[i].length;j++) {
                if(arr[i][j] == target) {
                   outerIndex = i;
                   innerIndex = j;
                   if(!findLast) {
                       found = true;
                       break;
                   }
                }
            }
            if (found) {
                break;
            }
        }
        if(outerIndex == -1) {
            System.out.println(target + " is not present in this array");
        } else {
            System.out.println(target + " is present in the index of arr[" + outerIndex + "][" + innerIndex + "]");
        }
    }

    public void linearSearchMultiple(int[][] arr, int target) {
//        int size = arr.length + arr[0].length;
        int size = 0;
        for(int i = 0;i<arr.length;i++) {
            size = size + arr[i].length;
        }
        int ans[][] = new int[size][2];
        int k = 0;
        for(int i = 0;i<arr.length;i++) {
            boolean found = false;
            for(int j = 0;j<arr[i].length;j++) {
                if(arr[i][j] == target) {
                    ans[k][0] = i;
                    ans[k][1] = j;
                    k++;
                }
            }
            if (found) {
                break;
            }
        }
        if(k == 0) {
            System.out.println(target + " is not present in this array");
        } else {
            for(int i = 0;i<k;i++) {
                System.out.println(target + " is present in the index of " + ans[i][0] + ", " + ans[i][1]);
            }
        }
    }

    public void findMaximumSumSubArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int resIndex = -1;
        for(int i = 0;i<arr.length;i++) {
            int sum = 0;
            for(int j = 0;j<arr[i].length;j++) {
                sum = sum + arr[i][j];
            }
            if(sum > max) {
                max = sum;
                resIndex = i;
            }
        }
        System.out.println("Maximum sum sub-array is : " + max + ", for the index " + resIndex);
    }

    public static void main(String[] args) {
        int[][] arr = {
                {2,5,9,8,7},
                {5,8,2,6,9},
                {2,8,9,4,7},
                {2,2,8,8,90}
        };
//        new LinearSearchIn2DArray().linearSearchIn2D(arr,2,false);
//        new LinearSearchIn2DArray().linearSearchIn2D(arr,2,true);
//        new LinearSearchIn2DArray().linearSearchMultiple(arr,2);
        new LinearSearchIn2DArray().findMaximumSumSubArray(arr);
    }
}
