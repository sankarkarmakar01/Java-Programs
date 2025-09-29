package MultiThreading;

public class MyThread2 extends Thread{

    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
//        System.out.println("Thread is running...");
//        for(int i = 1;i<=5;i++) {
//            try{
//                Thread.sleep(5000);
//            }
//            catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
//        }
        for(int i = 0;i<5;i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " -count: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 l = new MyThread2("Low Prority Thread");
        MyThread2 m = new MyThread2("Midium Prority Thread");
        MyThread2 h = new MyThread2("High Prority Thread");
//        t1.start();
//        t1.join();
//        System.out.println("Hello");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
