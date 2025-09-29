package others.dataStructuresAndAlgorithms.coderArmy.Lecture8;

public class Pattern27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (char j = 'E'; j >= 'E' - (i - 1); j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}