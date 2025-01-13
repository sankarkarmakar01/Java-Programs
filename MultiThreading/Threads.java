package MultiThreading;

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I am thread 1....");
            System.out.println("Hello");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I am thread 2....");
            System.out.println("World");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
