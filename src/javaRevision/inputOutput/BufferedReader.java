package javaRevision.inputOutput;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {
    static void main(String[] args) {
        try {
            // Wrapping InputStreamReader inside BufferedReader
            java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String name = br.readLine();  // reads a whole line

            System.out.println("Hello, " + name);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
