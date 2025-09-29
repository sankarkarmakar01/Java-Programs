package others.practice;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character:");
        char c = sc.next().trim().charAt(0);
        if(c == 'a'||c == 'e'||c == 'e'||c == 'i'|| c == 'o'||c == 'u'||c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U'){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        }
        sc.close();
    }
}
