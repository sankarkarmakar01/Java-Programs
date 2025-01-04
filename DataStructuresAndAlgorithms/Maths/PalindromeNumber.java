package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class PalindromeNumber {
    void palindrome(long num){
        long rem,ans = 0;
        long temp = num;
        while(num!=0){
            rem = num%10;
            ans = (ans*10) + rem;
            num /= 10;
        }
        if(ans == temp){
            System.out.println("THis number is palindrome number");
        } else {
            System.out.println("THis number is not palindrome number");
        }
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        p.palindrome(num);
        sc.close();
    }
}
