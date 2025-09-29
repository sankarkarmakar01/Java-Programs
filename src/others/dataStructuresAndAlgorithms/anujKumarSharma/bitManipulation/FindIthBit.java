package others.dataStructuresAndAlgorithms.anujKumarSharma.bitManipulation;

public class FindIthBit {
    public static void main(String[] args) {
        int n = 12;
        int i = 2;
        long mask = 1 << i;
        long ans = n & mask;
        if(ans != 0) {
            System.out.println("Bit is 1");
        } else {
            System.out.println("Bit is 0");
        }
    }
}
