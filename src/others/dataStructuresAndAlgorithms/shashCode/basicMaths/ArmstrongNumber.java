package others.dataStructuresAndAlgorithms.shashCode.basicMaths;

public class ArmstrongNumber {
    static String armstrongNumber(int n) {
        int rem, temp, num, count = 0, ans = 0;
        num = temp = n;

        while (n != 0) {
            rem = n % 10;
            count++;
            n /= 10;
        }

        while (num != 0) {
            rem = num % 10;
            ans += Math.pow(rem, count);
            num /= 10;
        }

        if (temp == ans) {
            return "Armstrong Number";
        } else {
            return "Not Armstrong Number";
        }
    }
    public static void main(String[] args) {
        System.out.println(armstrongNumber(371));
    }
}
