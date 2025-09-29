package others.dataStructuresAndAlgorithms.shashCode.basicMaths;

public class Factorial {
    static long factorial(int num) {
        long fact = 1;
        for (int i = 1;i<=num;i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
