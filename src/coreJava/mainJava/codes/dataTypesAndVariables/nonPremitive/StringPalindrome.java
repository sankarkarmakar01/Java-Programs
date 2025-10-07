package coreJava.mainJava.codes.dataTypesAndVariables.nonPremitive;

//Write a program to check if a string is a palindrome.

public class StringPalindrome {
    public static void main(String[] args) {
        String string = "Madam";
        String temp = string;
        String newString = "";
        for(int i = string.length() - 1;i>=0;i--) {
            newString += string.charAt(i);
        }
        if(newString.equalsIgnoreCase(temp)) {
            System.out.println("This string is a palindrome string.");
        } else {
            System.out.println("This string is not a palindrome string.");
        }
    }
}
