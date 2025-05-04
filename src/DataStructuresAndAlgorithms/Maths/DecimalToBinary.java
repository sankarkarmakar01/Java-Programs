package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class DecimalToBinary {

    public long DecimalToBinaryMethod(long num){
        long ans = 0;
        long mul = 1;
        while(num>0){
            long rem = num%2;
            num /= 2;
            ans += rem*mul;
            mul *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        DecimalToBinary d = new DecimalToBinary();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any decimal number: ");
        long de = sc.nextLong();
        long ans = d.DecimalToBinaryMethod(de);
        System.out.println("The binary number is " + ans);
        sc.close();
    }
}
