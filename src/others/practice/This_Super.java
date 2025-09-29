package others.practice;

class Base1{
    int a;
    Base1(int a){
        this.a = a;
    }
    public int myfun(){
        return a;
    }
}
public class This_Super {
    public static void main(String[] args) {
        Base1 b = new Base1(6);
        System.out.println(b.myfun());
    }
}
