package others.dataStructuresAndAlgorithms.coderArmy.Lecture4;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int packageAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the package amount: ");
        packageAmount = scanner.nextInt();
        if (packageAmount > 10) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }
        scanner.close();
    }
}
