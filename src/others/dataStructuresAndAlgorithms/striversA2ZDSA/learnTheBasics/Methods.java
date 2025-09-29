package others.dataStructuresAndAlgorithms.striversA2ZDSA.learnTheBasics;

public class Methods {
    static void greet(){
        System.out.println("Hello, Welcome to this world.");
    }
    void sum(int a,int b) {
        System.out.println("Sum is: " + (a + b));
    }
    public static void main(String[] args) {
        Methods methods = new Methods();
        greet();
        methods.sum(10,12);
    }
}
