package others.dataStructuresAndAlgorithms.shashCode.binarySearch;

public class BinarySearch {
    public int binarySearchInc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearchDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearchOrderAgnostic(int[] arr, int target) {
        if (arr.length == 0) return -1;

        boolean isAscending = arr[0] < arr[arr.length - 1];
        if (isAscending) {
            return binarySearchInc(arr, target);
        } else {
            return binarySearchDesc(arr, target);
        }
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        // Testing with properly sorted arrays would be better
        int[] properAsc = {2,5,7,8,9,10,12,16};
        int[] properDesc = {16,12,11,9,8,7,5,1};

        // Testing binarySearchInc with proper array
        int result = bs.binarySearchInc(properAsc, 12);
        printResult(result, 12);

        // Testing binarySearchDesc with proper array
        int resultDesc = bs.binarySearchDesc(properDesc, 11);
        printResult(resultDesc, 11);

        // Testing order agnostic search
        int resultOAInc = bs.binarySearchOrderAgnostic(properAsc, 7);
        printResult(resultOAInc, 7);

        int resultOADesc = bs.binarySearchOrderAgnostic(properDesc, 11);
        printResult(resultOADesc, 11);

        // Testing non-existent element
        int resultNotFound = bs.binarySearchOrderAgnostic(properAsc, 99);
        printResult(resultNotFound, 99);
    }

    private static void printResult(int result, int target) {
        if(result == -1) {
            System.out.println("Target " + target + " not found in the array.");
        } else {
            System.out.println("Target " + target + " found at index " + result + ".");
        }
    }
}