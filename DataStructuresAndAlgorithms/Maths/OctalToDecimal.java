package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class OctalToDecimal {
    public long OctalToDecimalMethod(long num){
        long ans = 0;
        long mul = 1;
        while(num>0){
            long rem = num%10;
            num /= 10;
            ans += rem*mul;
            mul *= 8;
        }
        return ans;
    }

    public static void main(String[] args) {
        OctalToDecimal d = new OctalToDecimal();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any octal number: ");
        long oc = sc.nextLong();
        long ans = d.OctalToDecimalMethod(oc);
        System.out.println("The decimal number is " + ans);
        sc.close();
    }
}
