package intermediateJava.multiThreading;

class MyNewThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My first thread");
        }
    }
}

class MyNewThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("My second thread");
    }
}

public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        t1.start();
        t1.join();
        t2.start();
    }
}
