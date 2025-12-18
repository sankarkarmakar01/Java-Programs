package javaRevision.controlFlow;

public class Break {
    static void main(String[] args) {
        System.out.println("Using break:");

        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                break; // exits the loop when i is 5
            System.out.println("i = " + i);
        }
    }
}
