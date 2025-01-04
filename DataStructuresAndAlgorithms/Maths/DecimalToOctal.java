package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class DecimalToOctal {
    public long DecimalToOctalMethod(long num){
        long ans = 0;
        long mul = 1;
        while(num>0){
            long rem = num%8;
            num /= 8;
            ans += rem*mul;
            mul *= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        DecimalToOctal d = new DecimalToOctal();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any decimal number: ");
        long de = sc.nextLong();
        long ans = d.DecimalToOctalMethod(de);
        System.out.println("The octal number is " + ans);
        sc.close();
    }
}
