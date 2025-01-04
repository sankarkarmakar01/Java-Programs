package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class ArmstrongNumber {
    void armstrong(long num){
        long rem,ans = 0;
        long temp = num;
        while(num!=0){
            rem = num%10;
            ans = ans + (rem*rem*rem);
            num /= 10;
        }
        if(ans == temp){
            System.out.println("THis number is armstrong number");
        } else {
            System.out.println("THis number is not armstrong number");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber a = new ArmstrongNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        a.armstrong(num);
        sc.close();
    }
}
