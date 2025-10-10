package others.dataStructuresAndAlgorithms.striversA2ZDSA.recursion;

public class StringPalindrome {

    static boolean checkPalindrome(int i, String str) {
        if(i >= str.length()/2) {
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        return checkPalindrome(i + 1, str);
    }

    public static void main(String[] args) {
        boolean ans = checkPalindrome(0, "MADAM");
        if(ans){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}


//Link:- https://leetcode.com/problems/valid-palindrome/description/

//class Solution {
//
//    boolean check(int i, String str) {
//        if(i >= str.length()/2){
//            return true;
//        }
//        if(str.charAt(i) != str.charAt(str.length() - i - 1)){
//            return false;
//        }
//        return check(i + 1, str);
//    }
//
//    public boolean isPalindrome(String s) {
//        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//        return check(0, s);
//    }
//}