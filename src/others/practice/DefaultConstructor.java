package others.practice;

class Student3 {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}

public class DefaultConstructor {
    DefaultConstructor() {
        System.out.println("I am Default Constructor");
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        DefaultConstructor d = new DefaultConstructor();
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.display();
        s2.display();
        
    }
}
