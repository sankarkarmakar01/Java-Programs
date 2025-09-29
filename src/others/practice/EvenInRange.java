package others.practice;

import java.util.Scanner;

public class EvenInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
