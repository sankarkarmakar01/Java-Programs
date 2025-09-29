package others.dataStructuresAndAlgorithms.shashCode.basicMaths;

public class PowerOfNumber {
    static int powerOfNumber(int num, int power) {
        int ans = 1;
        for(int i = 1;i<=power;i++) {
            ans *= num;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(powerOfNumber(2,3));
    }
}
