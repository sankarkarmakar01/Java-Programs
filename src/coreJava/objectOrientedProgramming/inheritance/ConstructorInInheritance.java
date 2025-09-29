package coreJava.objectOrientedProgramming.inheritance;

class Base{
    Base(){
        System.out.println("I am Base");
    }
    Base(int x) {
        System.out.println("The value of x: " + x);
    }
}

class Derived extends Base{
    Derived() {
        System.out.println("I am Derived");
    }
    Derived(int x,int y) {
        super(x);
        System.out.println("The value of y: " + y);
    }
}

class ChildDerived extends Derived {
    ChildDerived() {
        System.out.println("I am ChildDerived");
    }
    ChildDerived(int x,int y,int z) {
        super(x,y);
        System.out.println("The value of z: " + z);
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
//        Base b = new Base();
//        Derived d = new Derived(10,20);
        ChildDerived c = new ChildDerived(10,20,30);
    }
}
