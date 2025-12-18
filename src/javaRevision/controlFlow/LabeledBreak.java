package javaRevision.controlFlow;

public class LabeledBreak {
    static void main(String[] args) {
        System.out.println("Using labeled break:");

        outer: // label name
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2)
                    break outer; // breaks out of the outer loop
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}

