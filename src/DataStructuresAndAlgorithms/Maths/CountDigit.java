package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class CountDigit {
    public int count(int num){
        int ans = 0;
        while(num!=0){
            num = num/10;
            ans++;
        }
        return ans;
    }
    public int countWithLog(int num){
        return ((int)((int)Math.log(num)/Math.log(10) + 1));
    }

    public static void main(String[] args) {
        CountDigit cd = new CountDigit();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int num = sc.nextInt();
        int ans = cd.count(num);
        System.out.println("The number is digits is: " + ans);
        int ans2 = cd.countWithLog(num);
        System.out.println("The number is digits is: " + ans2);
        sc.close();
    }
}
