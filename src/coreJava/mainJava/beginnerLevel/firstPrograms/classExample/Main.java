package coreJava.mainJava.beginnerLevel.firstPrograms.classExample;

class Another {
    public void greet() {
        System.out.println("Hello, I another class...");
    }
}

public class Main {
    public static void main(String[] args) {
        new Another().greet();
    }
}
