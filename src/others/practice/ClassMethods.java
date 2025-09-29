package others.practice;

public class ClassMethods {
    public void m1() {
        System.out.println("This is method 1");
    }

    public void m2() {
        System.out.println("This is method 2");
    }

    public void m3() {
        System.out.println("This is method 3");
    }

    public static void main(String[] args) {
        ClassMethods c = new ClassMethods();
        c.m1();
        c.m2();
        c.m3();
    }
}
