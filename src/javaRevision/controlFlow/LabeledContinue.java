package javaRevision.controlFlow;

public class LabeledContinue {
    static void main(String[] args) {
        System.out.println("Using labeled continue:");

        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2)
                    continue outer; // skips to next iteration of outer loop
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}

