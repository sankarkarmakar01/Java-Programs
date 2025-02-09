package DataStructuresAndAlgorithms.Arrays.LinearSearch;
import java.util.Scanner;
public class LinearSearch {
    static int linearSearch(int[] arr, int n) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == n) {
                return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[1000];
        System.out.print("Enter the size of array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target number what to be find: ");
        int num = in.nextInt();
        int ans = linearSearch(arr,num);
        if(ans == -1) {
            System.out.println("The targeted number is not present in the array.");
        } else {
            System.out.println("The targeted number present in the index of " + ans);
        }
    }
}
