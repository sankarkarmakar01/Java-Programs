package others.dataStructuresAndAlgorithms.coderArmy.Lecture4;

import java.util.Scanner;

public class GradeSystem { public static void main(String[] args) {
    int marks;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter marks: ");
    marks = scanner.nextInt();

    if (marks > 33) {
        System.out.println("pass");
    } else {
        System.out.println("Fail");
    }
    scanner.close();
}

}
