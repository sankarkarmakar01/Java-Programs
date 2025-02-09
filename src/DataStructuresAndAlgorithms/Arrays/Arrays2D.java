package DataStructuresAndAlgorithms.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
