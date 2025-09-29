package others.dataStructuresAndAlgorithms.coderArmy.Lecture8;

public class Pattern20 {
    public static void main(String[] args) {
        int alphabet = 65;
        for (int i = 5 - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}