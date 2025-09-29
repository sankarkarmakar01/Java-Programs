package others.practice;

public class GenericsMethod {

    public static void main(String[] args) {
        printData("Hello");
        printData(123);

        GenericsMethod obj = new GenericsMethod();

        // obj.doubleData("123");
        obj.doubleData(123);

    }

    static <E> void printData(E data) {
        System.out.println(data);
    }

    // Bounded Generics
    <E extends Number> void doubleData(E data) {
        System.out.println(data);
    }
}
