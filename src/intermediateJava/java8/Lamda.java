package intermediateJava.java8;

public class Lamda {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };
        Runnable runnable = () -> {
            System.out.println("Hello");
        };
        Thread t1 = new Thread(runnable);
        t1.start();
        Thread t2 = new Thread(() -> {
            for(int i = 0;i < 10; i++) {
                System.out.println(i + " Hello World!");
            }
        });
        t2.start();
    }
}