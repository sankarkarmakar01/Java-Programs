package others.practice.practiceQuestions;

class Base {
    public void isYou() {
        System.out.println("I am base class");
    }
}

class Child extends Base {
    @Override
    public void isYou() {
        System.out.println("I am child of the base class");
    }
}


public class MethodOverride {
    public static void main(String[] args) {
        Base b = new Base();
        Child c = new Child();
        b.isYou();
        c.isYou();
    }
}


