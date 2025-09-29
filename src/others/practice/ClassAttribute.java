package others.practice;

public class ClassAttribute {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        ClassAttribute c = new ClassAttribute();
        System.out.println(c.a);
        c.b = 50;
        System.out.println(c.b);
    }
}