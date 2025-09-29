package others.practice;

class Parent1 {
    public void muFun() {
        System.out.println("I am Parent 1");
    }
}

class Child1 extends Parent1 {
    public void muFun() {
        System.out.println("I am Child 1");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        Child1 c = new Child1();
        c.muFun();
        p.muFun();
    }
}
