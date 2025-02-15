package OOPs.Inheritance;

class Calf extends Cow {
    void hello3() {
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
        ca.hello3();
    }
}
