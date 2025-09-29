package others.practice;

interface Animal {
    void eat();

    void drinks();

    default void sleep() {
        System.out.println("Animal is sleeping");
    }
}

interface Pet {
    void sings();

    void drinks();
}

class Monkey implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is singing");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.eat();
        m.sings();
        m.drinks();
        m.sleep();
    }
}
