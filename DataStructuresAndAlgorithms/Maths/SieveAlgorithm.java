package DataStructuresAndAlgorithms.Maths;

import java.util.Arrays;

public class SieveAlgorithm {
    public static void main(String[] args) {
        int num = 40;
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr,true);
        int counter = 2;
        while(counter<=num){
           if(arr[counter]){
               for(int factor = counter + counter;factor<=num;factor+=counter){
                   arr[factor] = false;
               }
           }
           counter++;
        }
        for(int i=2;i<=num;i++){
            System.out.println(i + " : " + arr[i]);
        }
    }
}
