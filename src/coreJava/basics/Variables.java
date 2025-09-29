package coreJava.basics;

public class Variables {
    static int a = 100; //static variable
    int method(){
        int b = 90; // local variable
        return b;
    }
    public static void main(String[] args) {

        Variables v = new Variables();

        int data = 10;
        System.out.println(data); //instance variable

        System.out.println(v.method()); // calling local variable of method()
        System.out.println(a); //
    }
}
