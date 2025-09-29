package others.dataStructuresAndAlgorithms.shashCode.basicMaths;

public class CountDigit {
    static int countDigit(int num) {
        int count = 0;
        while(num != 0) {
            int rem = num % 10;
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigit(12255));
    }
}
