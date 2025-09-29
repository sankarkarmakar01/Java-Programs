package others.dataStructuresAndAlgorithms.shashCode.basicMaths;

public class PalindromeNumber {
    static String palindromeNumber(int num) {
        int rem, ans = 0;
        while (num != 0) {
            rem = num % 10;
            ans = (ans * 10) + rem;
            num /= 10;
        }

        if (ans == ans) {
            return "Palindrome Number";
        } else {
            return "Not Palindrome Number";
        }
    }
    public static void main(String[] args) {
        System.out.println(palindromeNumber(121));
    }
}
