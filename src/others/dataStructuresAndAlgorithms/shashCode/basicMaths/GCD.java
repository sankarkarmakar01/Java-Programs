package others.dataStructuresAndAlgorithms.shashCode.basicMaths;

public class GCD {
    static int gcd(int num1, int num2) {
        int min = Math.min(num1, num2);
        while (min > 0) {
            if(num1 % min == 0 && num2 % min == 0) {
                return min;
            }
            min--;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(gcd(12,6));
    }
}
