package OOPs;

public class Constructor {

    Constructor() {
        System.out.println("Sankar Karmakar"); //default constructor
    }

    Constructor(String name, int age) { //parametarized constructor
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor("Sankar",20);
    }
}
