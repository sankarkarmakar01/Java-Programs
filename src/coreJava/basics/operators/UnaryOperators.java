package coreJava.basics.operators;

public class UnaryOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        boolean flag = true;

        // ➤ Unary Plus (+)
        int plus = +a;
        System.out.println("Unary plus (+a): " + plus); // 10

        // ➤ Unary Minus (-)
        int minus = -a;
        System.out.println("Unary minus (-a): " + minus); // -10

        // ➤ Increment (++a / a++)
        int preIncrement = ++a; // a becomes 11, then used
        System.out.println("Pre-increment (++a): " + preIncrement); // 11

        int postIncrement = a++; // a is 11, then becomes 12
        System.out.println("Post-increment (a++): " + postIncrement); // 11
        System.out.println("After post-increment, a = " + a); // 12

        // ➤ Decrement (--a / a--)
        int preDecrement = --a; // a becomes 11, then used
        System.out.println("Pre-decrement (--a): " + preDecrement); // 11

        int postDecrement = a--; // a is 11, then becomes 10
        System.out.println("Post-decrement (a--): " + postDecrement); // 11
        System.out.println("After post-decrement, a = " + a); // 10

        // ➤ Logical NOT (!)
        boolean notFlag = !flag;
        System.out.println("Logical NOT (!flag): " + notFlag); // false

        // ➤ Bitwise Complement (~)
        int bitwiseComplement = ~b; // ~(-10) = 9
        System.out.println("Bitwise Complement (~b): " + bitwiseComplement); // 9
    }
}
