package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class OctalToBinary {

    public long OctalToBinaryMethod(long num){
        long rem,r,n,ans = 0,mul = 1,a = 0,m = 1;
        while(num>0){
            rem = num%10;
            num /= 10;
            ans += rem*mul;
            mul *= 8;
        }
        n = ans;
        while(n>0){
            r = n%10;
            n /= 10;
            a += r*m;
            m *= 10;
        }
        return a;
    }

    public static void main(String[] args) {
        OctalToBinary b = new OctalToBinary();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any octal number: ");
        long oc = sc.nextLong();
        long ans = b.OctalToBinaryMethod(oc);
        System.out.println("The binary number is: " + ans);
        sc.close();
    }

}
