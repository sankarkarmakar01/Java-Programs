package coreJava.mainJava.codes.dataTypesAndVariables.nonPremitive;

//Write a program to reverse a string.

public class ReverseString {
    public static void main(String[] args) {
        String string = "Sankar";
        String newString = "";
        for(int i = string.length() - 1;i>=0;i--) {
            newString += string.charAt(i);
        }
        System.out.println(newString);
    }
}
