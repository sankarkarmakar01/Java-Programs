package coreJava.objectOrientedProgramming.inheritance;

class Animal {
    public void hello() {
        System.out.println("Hello");
    }
}

class Cow extends Animal {
    @Override
    public void hello() {
        System.out.println("Hello");
    }
}

class Calf extends Cow {
    void hello2() {
        System.out.println("I am a Calf");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cow c = new Cow();
        Calf ca = new Calf();
        a.hello();
        c.hello();
        ca.hello();
        ca.hello2();
    }
}
