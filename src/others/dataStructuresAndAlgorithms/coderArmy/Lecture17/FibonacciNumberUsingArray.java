package others.dataStructuresAndAlgorithms.coderArmy.Lecture17;

public class FibonacciNumberUsingArray {
    public int findFibonacci(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2;i<=n - 1;i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }
    public static void main(String[] args) {
        int ans = new FibonacciNumberUsingArray().findFibonacci(6);
        System.out.println(ans);
    }
}
