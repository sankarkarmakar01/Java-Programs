package javaRevision.dataTypes;

public class FinalExample {

    final int ID = 101;                  // constant (non-static)
    static final double PI = 3.14159;    // constant (shared by all)

    static void main(String[] args) {
        FinalExample obj = new FinalExample();

        System.out.println("ID: " + obj.ID);
        System.out.println("PI: " + PI);

        // obj.ID = 202;   // ❌ Error: cannot assign a value to final variable
    }
}
