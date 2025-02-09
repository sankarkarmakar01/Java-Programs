package DataStructuresAndAlgorithms.Arrays.LinearSearch;

public class CountEvenNumber {
//1295. Find Numbers with Even Number of Digits
    //Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7898};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] arr) {
        int count = 0;
        for (int num:arr) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }
   static int digits(int num) {
       int count = 0;
       while(num>0){
           count++;
           num/=10;
       }
       return count;
   }
   static boolean even(int num) {
       int numberOfDigits = digits(num);
       return numberOfDigits % 2 == 0;
   }
}
