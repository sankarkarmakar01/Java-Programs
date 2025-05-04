package DataStructuresAndAlgorithms.BinarySearch;

public class OrderAgnosticBinarySearch {

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAce = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(isAce) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = {10,9,8,7,6,5,4,3,2,1};
        int target = 6;
        int ans = orderAgnosticBinarySearch(arr2,target);
        System.out.println(ans);
    }
}
