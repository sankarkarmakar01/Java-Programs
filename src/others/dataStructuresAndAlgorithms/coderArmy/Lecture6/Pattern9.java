package others.dataStructuresAndAlgorithms.coderArmy.Lecture6;

public class Pattern9 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}