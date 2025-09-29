package others.practice;

class Dog<E> {
    E id;

    public Dog(E id) {
        this.id = id;
    }

    E getId() {
        return id;
    }
}

public class Generics {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        Dog<String> d1 = new Dog<String>("abc1");
        @SuppressWarnings("unused")
        Dog<String> d2 = new Dog<>("abc2");
        Dog<Integer> d3 = new Dog<>(12);

        System.out.println(d3.getId());
    }
}