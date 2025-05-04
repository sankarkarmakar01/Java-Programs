package DataStructuresAndAlgorithms.Arrays.LinearSearch;
import java.util.Scanner;
public class SearchInStrings {
    static int searchInString(String str,char target) {
        if(str.isEmpty()) {
            return -1;
        }
        for(int i = 0;i<str.length();i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[1000];
        System.out.print("Enter the string: ");
        String n = in.nextLine();
        System.out.print("Enter the target character : ");
        char c = in.next().trim().charAt(0);
        int ans = searchInString(n,c);
        if(ans == -1) {
            System.out.println("The targeted character is not present in the String.");
        } else {
            System.out.println("The targeted character present in the index of " + ans);
        }
    }
}



