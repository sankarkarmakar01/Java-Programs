package others.dataStructuresAndAlgorithms.shashCode.bitManupulation;

public class UnsetIthBit {
    public static int unsetIthBit(int num, int bit){
        return num & ~(1 << bit);
    }
    public static void main(String[] args) {
        new PrintBits().printBits(33);
        int result = unsetIthBit(33,5);
        new PrintBits().printBits(result);
    }
}
