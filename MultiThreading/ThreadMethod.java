package MultiThreading;

class Thread3 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello, I am thread " + i);
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args) {

    }
}
