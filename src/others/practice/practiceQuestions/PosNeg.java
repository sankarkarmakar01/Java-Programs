package others.practice.practiceQuestions;

import java.util.Scanner;

public class PosNeg {
    String check(int num) {
        try {
            if (num == 0) {
                return "It's zero";
            } else if (num < 0) {
                return "Negative";
            } else {
                return "Positive";
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PosNeg obj = new PosNeg();
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        String ans = obj.check(num);
        System.out.println(ans);
    }
}
