package others.dataStructuresAndAlgorithms.shashCode.bitManupulation;

public class FindEvenOdd {

    public static boolean isBitSet(int num, int bit) {
        int res = num & (1<<bit);
        return (res == 0) ? false : true;
    }

    public static void findEvenOdd(int num) {
        if(isBitSet(num,0)) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }
    public static void main(String[] args) {
        findEvenOdd(11);
    }
}
