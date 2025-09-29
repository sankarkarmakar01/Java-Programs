package others.dataStructuresAndAlgorithms.coderArmy.Lecture15;

import java.util.Scanner;

public class ConvertToUppercase {
    static void convert(char ch) {
        char ans = (char)(ch - 'a' + 'A');
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lowercase character: ");
        char ch = scanner.next().charAt(0);
        convert(ch);
        scanner.close();
    }
}