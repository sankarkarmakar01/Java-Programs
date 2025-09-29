package others.dataStructuresAndAlgorithms.shashCode.basicMaths;

public class DecimalToBinary {

    static long decimalToBinary(int num) {
        int mul = 1, ans = 0;
        while(num != 0) {
            int rem = (int)(num % 2);
            num /= 2;
            ans = ans + (mul * rem);
           mul = mul * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(18));
    }
}
