package others.dataStructuresAndAlgorithms.anujKumarSharma.bitManipulation;

public class SetIthBit {
    public void setIthBit(int n, int i) {
        long mask = 1 << i;
        long ans = n | mask;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new SetIthBit().setIthBit(12, 1);
    }
}
