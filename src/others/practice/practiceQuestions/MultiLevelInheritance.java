package others.practice.practiceQuestions;

class Super {
    void isYouSuper() {
        System.out.println("I am super class");
    }
}

class Sub extends Super {
    void isYouSub() {
        System.out.println("I am sub class");
    }
}

class  SSub extends Sub {
    void isYouSSub() {
        System.out.println("I am 2nd sub class");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Super sup = new Super();
        Sub sub = new Sub();
        SSub ssub = new SSub();
        ssub.isYouSSub();
        ssub.isYouSub();
        ssub.isYouSuper();
    }
}
