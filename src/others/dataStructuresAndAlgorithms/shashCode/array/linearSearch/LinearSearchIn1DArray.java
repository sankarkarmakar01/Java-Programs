package others.dataStructuresAndAlgorithms.shashCode.array.linearSearch;

public class LinearSearchIn1DArray {
    public void linearSearch(int[] arr, int target, boolean findLast) {
        int ans = -1;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == target) {
                ans = i;
                if(!findLast) {
                    break;
                }
            }
        }
        if(ans == -1) {
            System.out.println(target + " is not present in this array");
        } else {
            System.out.println(target + " is present in the index of " + ans);
        }
    }

    public void linearSearchMultiple(int[] arr, int target) {
        int[] ans = new int[arr.length];
        int k = 0;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }
        if(k == 0) {
            System.out.println(target + " is not present in this array");
        } else {
            for(int i = 0;i<k;i++) {
                System.out.println(target + " is present in the index of " + ans[i]);
            }
        }
    }

    public void findMaxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in this array is " + max);
    }

    public void findMinInArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element in this array is " + min);
    }

    public static void main(String[] args) {
        int[] arr = {-100,2,2,8,9,-6000,2,5,2,5,10};
//        new LinearSearchIn1DArray().linearSearch(arr,2,true);
//        new LinearSearchIn1DArray().linearSearch(arr,2,false);
//        new LinearSearchIn1DArray().linearSearchMultiple(arr,2);
        new LinearSearchIn1DArray().findMaxInArray(arr);
        new LinearSearchIn1DArray().findMinInArray(arr);
    }
}
