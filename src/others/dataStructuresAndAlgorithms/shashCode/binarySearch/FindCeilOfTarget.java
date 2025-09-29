package others.dataStructuresAndAlgorithms.shashCode.binarySearch;

public class FindCeilOfTarget {
    public static int binarySearchFindCeil(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                ans = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = arr[mid];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,5,8,8,9,9,9,11,12,16};
        int result = binarySearchFindCeil(arr,1);
        System.out.println("The floor number of the target is: " + result);
    }
}
