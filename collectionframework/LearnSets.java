package collectionframework;

import java.util.*;

public class LearnSets {

    enum Color{
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {

        System.out.println(Color.YELLOW);
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        System.out.println(enumSet);



//        Set<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(20);
//        set.add(100);
//        System.out.println(set);
//        System.out.println(set.contains(10));
    }
}
