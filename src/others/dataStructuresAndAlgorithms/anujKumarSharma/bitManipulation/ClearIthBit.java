package others.dataStructuresAndAlgorithms.anujKumarSharma.bitManipulation;

public class ClearIthBit {
    public void clearIthBit(int n, int i) {
        long mask = ~(1 << i);
        long ans = n & mask;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new ClearIthBit().clearIthBit(12, 2);
    }
}
