package others.dataStructuresAndAlgorithms.coderArmy.Lecture6;

public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            char ch = (char) ('a' + (i - 1));
            for (int j = 1; j <= 5; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}