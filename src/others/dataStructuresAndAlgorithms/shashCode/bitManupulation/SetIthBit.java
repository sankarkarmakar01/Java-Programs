package others.dataStructuresAndAlgorithms.shashCode.bitManupulation;

public class SetIthBit {

    public static int setIthBit(int num, int bit){
        return num | (1 << bit);
    }

    public static void main(String[] args) {
        new PrintBits().printBits(32);
        int result = setIthBit(32,3);
        new PrintBits().printBits(result);
    }
}
