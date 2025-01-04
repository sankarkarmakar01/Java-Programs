package DataStructuresAndAlgorithms.Maths;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int counter = 2;
        int sqroot = (int)Math.sqrt(num);
        while(counter <= sqroot){
            if(num%counter == 0){
                System.out.println(num + " is not a prime number ");
                return;
            }
            counter++;
        }
        System.out.println(num + " is a prime number ");
        sc.close();
    }
}
