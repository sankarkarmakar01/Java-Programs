package coreJava.objectOrientedProgramming.inheritance;

class Animal1 {
    void hello() {
        System.out.println("I am a Animal");
    }
}

class Cow1 extends Animal1 {
    void hello2() {
        System.out.println("I am a Cow");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        Cow1 c = new Cow1();
        a.hello();
        c.hello();
        c.hello2();
    }
}
