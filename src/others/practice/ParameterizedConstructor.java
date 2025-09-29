package others.practice;

public class ParameterizedConstructor {

    int roll;
    String name;

    ParameterizedConstructor() {
        System.out.println("No-arg constructor called");
    }

    ParameterizedConstructor(int r, String n) {
        this.roll = r;
        this.name = n;
    }

    void myFun() {
        System.out.println("Name: " + name + " and Roll: " + roll);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ParameterizedConstructor obj1 = new ParameterizedConstructor();
        ParameterizedConstructor obj2 = new ParameterizedConstructor(1, "John");
        obj2.myFun();
    }
}
