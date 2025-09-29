package others.practice;

public class Constructor1 {
    public static void main(String[] args) {
        Complex obj = new Complex(2,3);
        Complex obj2 = new Complex(4,1);
        obj.print();
        obj2.print();
    }
}

class Complex {
    int a, b;

public Complex(int real,int imaginary){
    a = real;
    b = imaginary;
}

    void print() {
        System.out.println(a + " + " + b+"i");
    }
}