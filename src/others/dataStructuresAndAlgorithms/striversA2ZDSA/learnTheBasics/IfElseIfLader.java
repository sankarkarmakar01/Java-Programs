package others.dataStructuresAndAlgorithms.striversA2ZDSA.learnTheBasics;

public class IfElseIfLader {
    public static void main(String[] args) {
        int marks = 86;
        if(marks > 90) {
            System.out.println("A++");
        } else if (marks > 80) {
            System.out.println("A");
        } else if (marks > 65) {
            System.out.println("B");
        } else if (marks > 50) {
            System.out.println("C");
        } else if (marks >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }
}
