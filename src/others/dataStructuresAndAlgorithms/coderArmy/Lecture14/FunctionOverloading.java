package others.dataStructuresAndAlgorithms.coderArmy.Lecture14;

public class FunctionOverloading {
    static void fun() {
        System.out.println("I am blank");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(int a, int b) {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        fun();
        fun(10);
        fun(5, 6);
    }
}