package others.practice;

class Gretting {
    public void myFun() {
        System.out.println("This is a Method of another class");
    }
}

public class Introduction {
    public int a = 10;

    public static void main(String[] args) {
        Introduction i = new Introduction();
        Gretting g = new Gretting();
        System.out.println(i.a);
        g.myFun();
    }
}
