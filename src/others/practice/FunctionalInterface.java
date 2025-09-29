package others.practice;

public class FunctionalInterface {
    Interface1 obj = new Interface1() {
        @Override
        public void myFun() {
            System.out.println("Functional Interface");
        }
    };
}

interface Interface1 {
    void myFun();
}