package others.dataStructuresAndAlgorithms.coderArmy.Lecture14;

public class PassByReference {
    static void inc(int[] n) { // Java doesn't have true pass-by-reference, so we use an array
        n[0]++;
        System.out.println(n[0]);
    }

    public static void main(String[] args) {
        int[] a = {10}; // Using array to simulate pass-by-reference
        inc(a);
        System.out.println(a[0]);
        inc(a);
    }
}