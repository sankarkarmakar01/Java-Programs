package intermediateJava.java8;

import java.util.*;
import java.util.stream.Collectors;

public class MethodReferences {
//    public static void print(String s) {
//        System.out.println(s);
//    }
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        List<Student1> student1s = names.stream().map(Student1::new).collect(Collectors.toList());
        System.out.println(student1s);

    }
}
