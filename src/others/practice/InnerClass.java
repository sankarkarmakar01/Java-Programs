package others.practice;

public class InnerClass {

    class Toy {
        int price;
    }

    static class Playstation {
        int price;
    }

    public static void main(String[] args) {
        Toy toy = new InnerClass().new Toy();
        toy.price = 100;
        System.out.println(toy.price);

        Playstation play = new Playstation();
        play.price = 120;
        System.out.println(play.price);

    }

}