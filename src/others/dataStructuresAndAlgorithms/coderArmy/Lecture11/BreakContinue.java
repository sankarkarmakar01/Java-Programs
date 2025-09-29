package others.dataStructuresAndAlgorithms.coderArmy.Lecture11;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}