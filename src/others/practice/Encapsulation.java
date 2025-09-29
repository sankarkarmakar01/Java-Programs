package others.practice;

public class Encapsulation {
    private int a = 10;

    public void getter() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.getter();
    }
}
