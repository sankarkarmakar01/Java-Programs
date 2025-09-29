package others.practice;

public class WrapperClass {
    public static void main(String[] args) {
        // Integer obj = new Integer(12);
        Integer obj2 = Integer.valueOf(13);
        Integer obj3 = 12; // autoboxing
        int age = obj3; // unboxing

        System.out.println(age);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}