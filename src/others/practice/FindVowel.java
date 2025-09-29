package others.practice;

import java.util.Scanner;

public class FindVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = new char[100];
        System.out.print("Enter the the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter your character one by one:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.next().trim().charAt(0);
        }
        for(int i = 0;i<n;i++){
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
                System.out.println(arr[i] + " is Vowel");
            }
            else {
                System.out.println(arr[i] + " is Consonant");
            }
        }
        sc.close();
    }
}
