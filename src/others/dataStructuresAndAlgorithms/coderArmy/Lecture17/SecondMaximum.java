package others.dataStructuresAndAlgorithms.coderArmy.Lecture17;

public class SecondMaximum {
    public int secondMax(int[] arr) {
        int first = -1, second = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        return second;
    }
    public static void main(String[] args) {
        int[] arr = {10,10,10,0};
        int ans = new SecondMaximum().secondMax(arr);
        System.out.println(ans);
    }
}
