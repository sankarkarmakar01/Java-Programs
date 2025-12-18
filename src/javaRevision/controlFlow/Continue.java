package javaRevision.controlFlow;

public class Continue {
    static void main(String[] args) {
        System.out.println("Using continue:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue; // skips the rest of the loop when i is 3
            System.out.println("i = " + i);
        }
    }
}

