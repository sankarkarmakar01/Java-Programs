package others.practice.practiceQuestions;

import java.util.Scanner;

public class Factorial {
    long factotial(int num) {
        int fact = 1;
        if(num == 0) {
            return fact;
        }
        else {
            for(int i = 1;i <= num;i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Factorial obj = new Factorial();
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        long factAns =obj.factotial(num);
        System.out.println("The factorial is: " + factAns);
    }
}
