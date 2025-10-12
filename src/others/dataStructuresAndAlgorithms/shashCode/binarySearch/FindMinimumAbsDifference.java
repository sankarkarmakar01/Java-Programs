package others.dataStructuresAndAlgorithms.shashCode.binarySearch;

public class FindMinimumAbsDifference {
    public int findMinimumAbsDifference(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        int res = 0;
        if(ans == -1) {
            if(end == -1) {
                res = Math.abs(target - arr[start]);
            } else if (start == arr.length) {
                res = Math.abs(target - arr[end]);
            } else {
                res = Math.min(Math.abs(target - arr[start]),Math.abs(target - arr[end]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,8,12,12,17,19};
        int ans = new FindMinimumAbsDifference().findMinimumAbsDifference(arr,100);
        System.out.println(ans);
    }
}
