package others.practice;

import java.io.*;

public class Throws {
   public static void findFile() throws IOException{
    File newFile = new File("test.txt");
    FileInputStream stream1 = new FileInputStream(newFile);
    System.out.println(stream1);
   }

   public static void main(String[] args) throws IOException {
    findFile();
   }
}
