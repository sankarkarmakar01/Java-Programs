package others.dataStructuresAndAlgorithms.shashCode.binarySearch;

public class BinarySearchQuestions {
    public static void binarySearch(int[] arr, int target, boolean isFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if(ans == -1) {
            System.out.println("Target " + target + " not found in the array.");
        } else {
            System.out.println("Target " + target + " found at index " + ans + ".");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,4,4,4,6,8,9};
        binarySearch(arr,4,true);
        binarySearch(arr,4,false);
    }
}
