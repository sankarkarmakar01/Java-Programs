package coreJava.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize array
        int[] arr = new int[100]; // max size
        int size;

        // Input array
        System.out.print("Enter number of elements: ");
        size = sc.nextInt();

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("\n---- Array Operations Menu ----");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Update element");
            System.out.println("4. Search element");
            System.out.println("5. Sort array");
            System.out.println("6. Reverse array");
            System.out.println("7. Copy array");
            System.out.println("8. Display array");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Insert
                    System.out.print("Enter element to insert: ");
                    int insertVal = sc.nextInt();
                    System.out.print("Enter position (0 to " + size + "): ");
                    int insertPos = sc.nextInt();
                    if (insertPos < 0 || insertPos > size) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    for (int i = size; i > insertPos; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[insertPos] = insertVal;
                    size++;
                    System.out.println("Element inserted.");
                    break;

                case 2: // Delete
                    System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");
                    int delPos = sc.nextInt();
                    if (delPos < 0 || delPos >= size) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    for (int i = delPos; i < size - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    size--;
                    System.out.println("Element deleted.");
                    break;

                case 3: // Update
                    System.out.print("Enter index to update (0 to " + (size - 1) + "): ");
                    int updIndex = sc.nextInt();
                    System.out.print("Enter new value: ");
                    int newVal = sc.nextInt();
                    if (updIndex < 0 || updIndex >= size) {
                        System.out.println("Invalid index!");
                    } else {
                        arr[updIndex] = newVal;
                        System.out.println("Element updated.");
                    }
                    break;

                case 4: // Search
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index: " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 5: // Sort
                    Arrays.sort(arr, 0, size);
                    System.out.println("Array sorted.");
                    break;

                case 6: // Reverse
                    for (int i = 0; i < size / 2; i++) {
                        int temp = arr[i];
                        arr[i] = arr[size - 1 - i];
                        arr[size - 1 - i] = temp;
                    }
                    System.out.println("Array reversed.");
                    break;

                case 7: // Copy
                    int[] copy = Arrays.copyOf(arr, size);
                    System.out.println("Copied Array:");
                    for (int val : copy) {
                        System.out.print(val + " ");
                    }
                    System.out.println();
                    break;

                case 8: // Display
                    System.out.println("Current Array:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 9: // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
