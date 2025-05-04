package OOPs.Inheritance;

class Animal {
    void hello() {
        System.out.println("I am a Animal");
    }
}

class Cow extends Animal {
    void hello2() {
        System.out.println("I am a Cow");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cow c = new Cow();
        a.hello();
        c.hello();
        c.hello2();
    }
}
