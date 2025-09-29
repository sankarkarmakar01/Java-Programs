package coreJava.objectOrientedProgramming.polymorphism;

class A {
    void greed() {
        System.out.println("Hello World!");
    }
    void greed(String name) {
        System.out.println("Hello " + name);
    }
    int greed(int x,int y) {
        return x + y;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        A a = new A();
        a.greed();
        a.greed("Sankar");
        System.out.println(a.greed(10,5));
    }
}
