package others.dataStructuresAndAlgorithms.shashCode.bitManupulation;

public class ToggleBit {
    public static int toggleBit(int num, int bit) {
        return num ^ (1 << bit);
    }
    public static void main(String[] args) {
        new PrintBits().printBits(33);
        int result = toggleBit(33,4);
        new PrintBits().printBits(result);
    }
}
