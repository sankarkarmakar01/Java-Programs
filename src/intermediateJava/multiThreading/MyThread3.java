package intermediateJava.multiThreading;

class MyThread4 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i<=10){
            System.out.println("My thread is running....");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread5 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i<=10){
            System.out.println("Thread 5 is good....");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class MyThread3 {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();
        MyThread5 t2 = new MyThread5();
        t1.start();
        t2.start();
    }
}
