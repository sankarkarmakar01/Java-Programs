package intermediateJava.java8;

interface Sankar2 {
    void greed(String name);
    static void greed2() {
        System.out.println("Hello, I am static");
    }
}
public class StaticMethods implements Sankar2 {
    @Override
    public void greed(String name) {
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        DefaultMethods obj = new DefaultMethods();
        obj.greed("Sankar");
        Sankar2.greed2();
    }
}
