package coreJava.objectOrientedProgramming.interfaces;

public class ExampleOfInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        Bird b = new Bird();
        d.eat();
        b.eat();
        b.sing();
    }
}

interface Animal {
    void eat();
}

interface Animal2 {
    void sing();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog -> Eat");
    }
}

class Bird implements Animal,Animal2 {
    @Override
    public void eat() {
        System.out.println("Bird -> Eat");
    }

    @Override
    public void sing() {
        System.out.println("Bird -> Sing");
    }
}
