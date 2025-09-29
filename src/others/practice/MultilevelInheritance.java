package others.practice;

class GrandParent2 {
    void myFun1() {
        System.out.println("We are Grand Parent 2");
    }
}

class Parent2 extends GrandParent2 {
    void myFun2() {
        System.out.println("We are Parent 2");
    }
}

class Child2 extends Parent2 {
    void myFun3() {
        System.out.println("We are Child 2");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.myFun1();
        c.myFun2();
        c.myFun3();
    }
}
