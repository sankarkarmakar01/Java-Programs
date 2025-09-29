package others.dataStructuresAndAlgorithms.shashCode.basicMaths;

public class ZerosInFactorial {
    static long zerosInFactorial(int num) {
        long fact = 1, count = 0;
        for (int i = 1;i<=num;i++) {
            fact *= i;
        }
       while(fact != 0) {
           int rem = (int) (fact % 10);
           if(rem == 0) {
               count++;
           }
           fact /= 10;
       }
       return count;
    }
    public static void main(String[] args) {
        System.out.println(zerosInFactorial(5));
    }
}
