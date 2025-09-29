package coreJava.objectOrientedProgramming.polymorphism;

class B {
    void greed() {
        System.out.println("Hello World!");
    }
}

class C extends B{
    void greed(String name) {
        System.out.println("Hello " + name);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        C c = new C();
        c.greed();
        c.greed("Sankar");
    }
}
