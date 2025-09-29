package others.practice;

class One{
    public void name(){
        System.out.println("My name is Java");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}

class Two extends One{
    public void name(){
        System.out.println("My name is Java in class two");
    }
    public void hello(){
        System.out.println("Hello World");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        One obj = new Two();
        obj.name();
        obj.greet();
        // obj.hello(); It is not possible
    }
}
