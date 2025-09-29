package intermediateJava.java8;

interface Sankar {
    void greed(String name);
    default void greed2() {
        System.out.println("Hello, I am default");
    }
}

public class DefaultMethods implements Sankar {

    @Override
    public void greed(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        DefaultMethods obj = new DefaultMethods();
        obj.greed("Sankar");
        obj.greed2();
    }
}
