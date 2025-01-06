package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class BinaryToOctal {

    public long BinaryToOctalMethod(long num){
        long rem,r,n,ans = 0,mul = 1,a = 0,m = 1;
        while(num>0){
            rem = num%10;
            num /= 10;
            ans += rem*mul;
            mul *=2;
        }
        n = ans;
        while(n>0){
            r = n%8;
            n /= 8;
            a += r*m;
            m *= 10;
        }
        return a;
    }
    public static void main(String[] args) {
        BinaryToOctal b = new BinaryToOctal();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number: ");
        long bin = sc.nextLong();
        long ans = b.BinaryToOctalMethod(bin);
        System.out.println("The octal number is: " + ans);
        sc.close();
    }
}
