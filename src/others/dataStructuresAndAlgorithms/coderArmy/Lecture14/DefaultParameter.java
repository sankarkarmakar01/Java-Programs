package others.dataStructuresAndAlgorithms.coderArmy.Lecture14;

public class DefaultParameter {
    static void defaultParameter(int a, int b) {
        System.out.println(a + " " + b);
    }

    // Overloaded methods to simulate default parameters
    static void defaultParameter(int a) {
        defaultParameter(a, 10);
    }

    static void defaultParameter() {
        defaultParameter(12, 10);
    }

    public static void main(String[] args) {
        defaultParameter(5, 9);
        defaultParameter(15);
        defaultParameter();
    }
}