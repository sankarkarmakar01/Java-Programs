package intermediateJava.multiThreading;

class MyThr extends Thread {
    @Override
    public void run() {
        System.out.println("Hello");
    }
    public MyThr(String name) {
        super(name);
    }
}

public class ConstructorInThread {
    public static void main(String[] args) {
        MyThr obj = new MyThr("Sankar");
        obj.start();
        System.out.println("Id: " + obj.getId());
        System.out.println("Id: " + obj.getName());
    }
}
