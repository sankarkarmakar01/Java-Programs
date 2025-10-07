package coreJava.mainJava.codes.dataTypesAndVariables.premitive;

//Write a program to find the ASCII value of a character.

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        char ch = new Scanner(System.in).next().trim().charAt(0);
        System.out.println("ASCII: " + (int)(ch));
    }
}
