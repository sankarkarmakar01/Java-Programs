package javaRevision.inputOutput;

import java.io.IOException;

public class InputStreamReader {
    static void main(String[] args) {
        try {
            java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
            System.out.print("Enter a character: ");
            int ch = isr.read();  // reads one character (returns ASCII code)
            System.out.println("You entered: " + (char) ch);
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
