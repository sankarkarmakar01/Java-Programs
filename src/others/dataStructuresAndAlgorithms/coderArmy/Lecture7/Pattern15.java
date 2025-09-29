package others.dataStructuresAndAlgorithms.coderArmy.Lecture7;

public class Pattern15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            char ch = (char) ('a' + (i - 1));
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}