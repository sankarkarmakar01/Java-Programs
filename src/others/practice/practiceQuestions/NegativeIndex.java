package others.practice.practiceQuestions;

public class NegativeIndex {
    public static void main(String[] args) {
        try {
        int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        }
        try {
            int ans = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
