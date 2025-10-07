package coreJava.mainJava.codes.introductionToJava;

//Write a Java program to print a pattern like this:
//        *
//        **
//        ***
//        ****
//        *****

public class Pattern {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++) {
            for(int j = 0;j<= i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
