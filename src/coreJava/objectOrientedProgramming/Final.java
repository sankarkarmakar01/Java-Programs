package coreJava.objectOrientedProgramming;

final class Z{
    void greed() {
        System.out.println("Hello");
    }
    final void greed2() {
        System.out.println("I am final greed");
    }
}

//class ZZZ extends Z {
//    @Override
//    void greed2() {
//        //Not Possible
//    }
//}

public class Final {
    public static void main(String[] args) {
        final int a = 10;
        System.out.println(a);
//        a = 20;
        Z z = new Z();
        z.greed();
        z.greed2();
    }
}