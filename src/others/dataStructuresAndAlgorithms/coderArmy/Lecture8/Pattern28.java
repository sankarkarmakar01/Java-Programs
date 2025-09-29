package others.dataStructuresAndAlgorithms.coderArmy.Lecture8;

public class Pattern28 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}