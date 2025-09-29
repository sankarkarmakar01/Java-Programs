package others.practice.practiceQuestions;

interface Car {
    void model();
    void run();
}

class BMW implements Car {
    @Override
    public void model() {
        System.out.println("BMW");
    }
    @Override
    public void run() {
        System.out.println("1000 Km/h");
    }
}

public class UseInterface {
    public static void main(String[] args) {
        BMW obj = new BMW();
        obj.model();
        obj.run();
    }
}
