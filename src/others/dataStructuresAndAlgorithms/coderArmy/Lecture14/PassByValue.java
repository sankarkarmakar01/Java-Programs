package others.dataStructuresAndAlgorithms.coderArmy.Lecture14;

public class PassByValue {
    static void inc(int n) {
        n++;
        System.out.println(n);
    }

    public static void main(String[] args) {
        int a = 10;
        inc(a);
        System.out.println(a);
        inc(a);
    }
}