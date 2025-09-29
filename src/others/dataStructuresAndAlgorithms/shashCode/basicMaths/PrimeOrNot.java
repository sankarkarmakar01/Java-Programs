package others.dataStructuresAndAlgorithms.shashCode.basicMaths;

public class PrimeOrNot {
    static void primeOrNot(int num) {
        if(num == 0 || num == 1) {
            System.out.println("Not Prime");
            return;
        }
        for(int i = 2;i<num;i++) {
            if(num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
    public static void main(String[] args) {
        primeOrNot(13);
    }
}
