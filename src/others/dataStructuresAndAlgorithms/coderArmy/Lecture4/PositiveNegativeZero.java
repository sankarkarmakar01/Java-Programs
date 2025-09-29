package others.dataStructuresAndAlgorithms.coderArmy.Lecture4;

import java.util.Scanner;

public class PositiveNegativeZero {public static void main(String[] args) {
    int num;
    System.out.print("Enter the number:");
    num = new Scanner(System.in).nextInt();
    if (num == 0) {
        System.out.println("Zero");
    } else if (num > 0) {
        System.out.println("Positive");
    } else {
        System.out.println("Negative");
    }
}

}
