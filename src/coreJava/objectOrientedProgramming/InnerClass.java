package coreJava.objectOrientedProgramming;

public class InnerClass {

    class Inner {
        void greed() {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        new InnerClass().new Inner().greed();
    }
}
