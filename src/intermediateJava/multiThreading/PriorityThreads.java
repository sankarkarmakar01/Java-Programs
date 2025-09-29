package MultiThreading;

class Thr extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
public class PriorityThreads {
    public static void main(String[] args) {
        Thr obj = new Thr();
        obj.start();
        System.out.println(obj.getPriority());
    }
}
