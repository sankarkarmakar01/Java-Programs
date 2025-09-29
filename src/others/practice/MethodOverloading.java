package others.practice;

public class MethodOverloading {
    void myFun() {
        System.out.println("No arguments");
    }

    void myFun(int a) {
        System.out.println("One argument: " + a);
    }

    void myFun(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is:" + (a + b));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.myFun();
        obj.myFun(10);
        obj.myFun(10, 20);
    }
}
