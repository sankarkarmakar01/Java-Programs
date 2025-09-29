package coreJava.basics;

public class Bitwise {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(Integer.toBinaryString(a));
        //operators --> byte shorts int long
        // and &
        // or |
        // not !
        // xor ^
        // left shift <<
        // right shift >>
        // unsigned right shift >>>
        int c = 5 & 4;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(c);
    }
}
