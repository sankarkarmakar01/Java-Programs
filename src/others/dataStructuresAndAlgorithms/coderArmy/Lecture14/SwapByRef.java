package others.dataStructuresAndAlgorithms.coderArmy.Lecture14;

import java.util.Scanner;

public class SwapByRef {
    static void swapPassByRef(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
        System.out.println("After:-");
        System.out.println(nums[0] + " " + nums[1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];

        System.out.print("Enter the first number:");
        numbers[0] = scanner.nextInt();
        System.out.print("Enter the second number:");
        numbers[1] = scanner.nextInt();

        System.out.println("Before:-");
        System.out.println(numbers[0] + " " + numbers[1]);

        swapPassByRef(numbers);
        scanner.close();
    }
}