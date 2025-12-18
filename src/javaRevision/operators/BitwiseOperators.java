package javaRevision.operators;

public class BitwiseOperators {

    static void main(String[] args) {
        int a = 10;    // 1010 in binary
        int b = 5;     // 0101 in binary

        // ➤ Bitwise AND (&)
        int andResult = a & b;
        System.out.println("a & b = " + andResult); // 0

        // ➤ Bitwise OR (|)
        int orResult = a | b;
        System.out.println("a | b = " + orResult); // 15

        // ➤ Bitwise XOR (^)
        int xorResult = a ^ b;
        System.out.println("a ^ b = " + xorResult); // 15

        // ➤ Bitwise Complement (~)
        int notA = ~a;
        System.out.println("~a = " + notA); // -11

        // ➤ Left Shift (<<)
        int leftShift = a << 2; // 1010 << 2 = 101000 = 40
        System.out.println("a << 2 = " + leftShift);

        // ➤ Right Shift (>>)
        int rightShift = a >> 2; // 1010 >> 2 = 0010 = 2
        System.out.println("a >> 2 = " + rightShift);

        // ➤ Unsigned Right Shift (>>>)
        int unsignedRightShift = a >>> 2; // Same as >> for positive numbers
        System.out.println("a >>> 2 = " + unsignedRightShift);
    }
}
