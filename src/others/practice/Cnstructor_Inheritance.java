package others.practice;

class Base{
    Base(){
        System.out.println("Hello, I am Base Class");
    }
    Base(int x){
        System.out.println("The value of x is:"+x);
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("Hello, I am Derived Class");
    }
    Derived(int x,int y){
        super(1);
        System.out.println("The value of y is:"+y);
    }
}

class Child extends Derived{
    Child(){
        System.out.println("Hello, I am Child Class");
    }
    Child(int x,int y,int z){
        super(10,20);
        System.out.println("The value of z is:"+z);
    }
}

public class Cnstructor_Inheritance {
    public static void main(String[] args) {
        //Derived d = new Derived();
        @SuppressWarnings("unused")
        Child c = new Child(50,60,70);
    }
}
