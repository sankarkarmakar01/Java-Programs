package others.dataStructuresAndAlgorithms.coderArmy.Lecture4;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c;
        System.out.print("Enter any character: ");
        c = scanner.next().charAt(0);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        scanner.close();
    }
}
