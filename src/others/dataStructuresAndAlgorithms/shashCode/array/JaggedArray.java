package others.dataStructuresAndAlgorithms.shashCode.array;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] my2dArray = new int[3][];
        int[][] my2dArray2 = {
                {1,2,3},
                {4,5},
                {6,7,8},
                {9}
        };

        for (int i = 0;i<my2dArray2.length;i++) {
            for(int j = 0;j<my2dArray2[i].length;j++) {
                System.out.println(my2dArray2[i][j]);
            }
        }
    }
}
