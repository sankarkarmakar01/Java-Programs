package others.practice.practiceQuestions;

class Parent {
    static void show() {
        System.out.println("Static method in Parent class");
    }
}

class Child1 extends Parent {
    static void show() {
        System.out.println("Static method in Child class");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent childAsParent = new Child1();
        Child1 child1 = new Child1();

        Parent.show();
        Parent.show();
        Child1.show();
    }
}
