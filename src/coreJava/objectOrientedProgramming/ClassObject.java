package coreJava.objectOrientedProgramming;

public class ClassObject {
    void greed() {
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        ClassObject obj = new ClassObject();
        obj.greed();
        System.out.println(obj);
    }
}
