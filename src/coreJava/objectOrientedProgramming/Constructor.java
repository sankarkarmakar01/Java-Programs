package coreJava.objectOrientedProgramming;

public class Constructor {

    Constructor() {
        System.out.println("Sankar Karmakar"); //default constructor
    }

    Constructor(String name, int age) { //parameterized constructor
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor("Sankar",20);
    }
}
