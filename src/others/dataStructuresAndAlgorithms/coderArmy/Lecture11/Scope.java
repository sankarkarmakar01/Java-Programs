package others.dataStructuresAndAlgorithms.coderArmy.Lecture11;

public class Scope {
    public static void main(String[] args) {
        // System.out.println(n); // Error: n not declared yet
        int n = 10;
        // System.out.println(n);
        // int n = 30; // Error: duplicate variable
        // System.out.println(n);
        int i = 30;

        if (i == 30) {
            // int n = 60; // Error: duplicate variable
            System.out.println(n);
        }
    }
}