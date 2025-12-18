package javaRevision.dataTypes;

public class Primitives {
    static void main(String[] args) {
        byte b = 127; //8-bit -128 to 127
        System.out.println(b);
        short s = 1288; //16-bit -32,768 to 32,767
        System.out.println(s);
        int i = 569; //32-bit -2^31 to (2^31 - 1)
        System.out.println(i);
        long l = 25468554; //64-bit -2^63 to (2^63 - 1)
        System.out.println(l);
        float f = 10.58f; //32-bit storing 6 to 7 decimal digits
        System.out.println(f);
        double d = 125.255215655525; //64-bit storing 15 to 16 decimal digits
        System.out.println(d);
        boolean bool = true; //8-bit
        System.out.println(bool);
        char ch = 'S'; //16-bit because storing Unicode also
        System.out.println(ch);
    }
}
