package others.practice;

class Student {
    void stu() {
        System.out.println("I am a student");
    }
}

class Arts extends Student {
    void art() {
        System.out.println("I am an arts student");
    }
}

class Science extends Student {
    void sci() {
        System.out.println("I am a science student");
    }
}

class Commerce extends Student {
    void com() {
        System.out.println("I am a commerce student");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Arts a = new Arts();
        Science s = new Science();
        Commerce c = new Commerce();
        a.art();
        s.sci();
        c.com();
    }
}
