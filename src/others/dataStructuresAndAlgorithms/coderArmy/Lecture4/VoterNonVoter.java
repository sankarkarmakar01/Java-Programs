package others.dataStructuresAndAlgorithms.coderArmy.Lecture4;

import java.util.Scanner;

public class VoterNonVoter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Voter");
        } else {
            System.out.println("Non Voter");
        }
        scanner.close();
    }
}
