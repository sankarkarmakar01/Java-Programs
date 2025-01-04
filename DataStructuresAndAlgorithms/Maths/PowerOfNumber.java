package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the power: ");
        int p = sc.nextInt();
        int ans = 1;
        for(int i = 0;i<p;i++){
            ans *= n;
        }
        System.out.println(ans);
        sc.close();
    }
}
