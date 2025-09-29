package coreJava.basics.operators;

public class LogicalOperators {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // ➤ Logical AND (&&)
        boolean andResult = a && b;
        System.out.println("a && b: " + andResult); // false

        // ➤ Logical OR (||)
        boolean orResult = a || b;
        System.out.println("a || b: " + orResult); // true

        // ➤ Logical NOT (!)
        boolean notA = !a;
        boolean notB = !b;
        System.out.println("!a: " + notA); // false
        System.out.println("!b: " + notB); // true

        // ➤ Combining expressions
        int x = 10, y = 20;
        System.out.println("(x < y) && (a == true): " + ((x < y) && (a == true))); // true
        System.out.println("(x > y) || (b == false): " + ((x > y) || (b == false))); // true
    }
}
