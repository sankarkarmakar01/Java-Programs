package DataStructuresAndAlgorithms.Arrays.LinearSearch;
import java.util.Scanner;
public class FindMaxMinInArray {
    static void MaxMin(int[] arr, int size) {
        int max,min;
        min = arr[0];
        max = arr[0];
        for (int i = 1; i < size; i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The minimum element is: " + min);
        System.out.println("The maximum element is: " + max);
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
        MaxMin(arr,n);
    }
}



