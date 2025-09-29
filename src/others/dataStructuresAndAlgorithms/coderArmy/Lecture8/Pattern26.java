package others.dataStructuresAndAlgorithms.coderArmy.Lecture8;

public class Pattern26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            char ch = (char)('A' + (i - 1));
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}