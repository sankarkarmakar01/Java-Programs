package coreJava.objectOrientedProgramming;

class Parent {
    void greed() {
        System.out.println("We are parent");
    }
}

class Child extends Parent {
    void greed() {
        System.out.println("I am child");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

//        p.greed();
//        c.greed();
        pc.greed();
    }
}
