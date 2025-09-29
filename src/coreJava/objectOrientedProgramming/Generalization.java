package coreJava.objectOrientedProgramming;

class Father {
    public void work()
    {
        System.out.println("Earning Father");
    }
}

class Son extends Father {
    public void play()
    {
        System.out.println("Enjoying son");
    }
}

public class Generalization {
    public static void main(String[] args) {
        Father father = new Son();
//        father = (Father) new Son();
        father.work();
    }
}
