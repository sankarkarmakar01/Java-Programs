package javaRevision.operators;

public class AssignmentOperators {

    static void main(String[] args) {
        int a;

        // ➤ Simple Assignment (=)
        a = 10;
        System.out.println("a = " + a); // 10

        // ➤ Add and Assign (+=)
        a += 5; // a = a + 5
        System.out.println("a += 5 → " + a); // 15

        // ➤ Subtract and Assign (-=)
        a -= 3; // a = a - 3
        System.out.println("a -= 3 → " + a); // 12

        // ➤ Multiply and Assign (*=)
        a *= 2; // a = a * 2
        System.out.println("a *= 2 → " + a); // 24

        // ➤ Divide and Assign (/=)
        a /= 4; // a = a / 4
        System.out.println("a /= 4 → " + a); // 6

        // ➤ Modulus and Assign (%=)
        a %= 4; // a = a % 4
        System.out.println("a %= 4 → " + a); // 2

        // ➤ AND and Assign (&=)
        a = 5;       // 0101
        a &= 3;      // 0011 → 0001
        System.out.println("a &= 3 → " + a); // 1

        // ➤ OR and Assign (|=)
        a = 5;       // 0101
        a |= 2;      // 0010 → 0111
        System.out.println("a |= 2 → " + a); // 7

        // ➤ XOR and Assign (^=)
        a = 5;       // 0101
        a ^= 1;      // 0001 → 0100
        System.out.println("a ^= 1 → " + a); // 4

        // ➤ Left Shift and Assign (<<=)
        a = 3;
        a <<= 2;     // 0011 → 1100
        System.out.println("a <<= 2 → " + a); // 12

        // ➤ Right Shift and Assign (>>=)
        a = 8;
        a >>= 1;     // 1000 → 0100
        System.out.println("a >>= 1 → " + a); // 4

        // ➤ Unsigned Right Shift and Assign (>>>=)
        a = -16;
        a >>>= 2;
        System.out.println("a >>>= 2 → " + a); // platform dependent (positive large int)
    }
}
