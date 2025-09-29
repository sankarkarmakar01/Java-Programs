package others.dataStructuresAndAlgorithms.coderArmy.Lecture17;

public class PassingArrayAsAFunction {
    public void fun(int[] arr) {
        for(int i = 0;i<arr.length;i++) {
            System.out.println(i + " => " + arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        new PassingArrayAsAFunction().fun(arr);
    }
}
