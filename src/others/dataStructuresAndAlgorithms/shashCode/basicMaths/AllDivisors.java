package others.dataStructuresAndAlgorithms.shashCode.basicMaths;

public class AllDivisors {
    static void allDivisors(int num) {
        for(int i = 1;i<=num;i++) {
            if(num % i == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        allDivisors(10);
    }
}
