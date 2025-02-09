package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println(num + " is Even number");
        } else {
            System.out.println(num + " is Odd number");
        }
        sc.close();
    }
}
