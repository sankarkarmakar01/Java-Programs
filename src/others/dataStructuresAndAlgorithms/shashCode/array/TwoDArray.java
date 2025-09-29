package others.dataStructuresAndAlgorithms.shashCode.array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] my2dArray = new int[3][2];

        for(int  i = 0;i < my2dArray.length;i++) {
            for(int j = 0;j < my2dArray[i].length;j++) {
                System.out.println("Enter [" + i + "]" + "[" + j + "] " + "element: ");
                int element = new Scanner(System.in).nextInt();
                my2dArray[i][j] = element;
            }
        }

        for(int  i = 0;i < my2dArray.length;i++) {
            for(int j = 0;j < my2dArray[i].length;j++) {
                System.out.println(my2dArray[i][j]);
            }
        }
    }
}
