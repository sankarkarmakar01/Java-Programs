package others.dataStructuresAndAlgorithms.coderArmy.Lecture16;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {10, 9, 55, 78, 33};
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        System.out.print("Minimum element is: " + ans);
    }
}