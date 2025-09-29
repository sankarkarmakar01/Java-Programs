package others.practice;

import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // List<Integer> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1);

        System.out.println(list);
        
        System.out.println(list.get(0));
        list.set(1, 200);
        System.out.println(list);

        list.add(2,1000);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        System.out.println(list.lastIndexOf(300));




        // list2.add(100);
        // list2.add(200);
        // list2.add(300);
        // list2.add(1);
        // list.add("Sankar");

        // System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.contains(20));
        // list.remove(2);
        // System.out.println(list);
        // list.remove(Integer.valueOf(1));
        // System.out.println(list);

        // System.out.println(list);
        // list.addAll(list2);
        // System.out.println(list);

        // list.removeAll(list2);
        // System.out.println(list);
        // list.retainAll(list2);
        // System.out.println(list);

        // Object a[] = list.toArray();
        // for (Object object : a) {
        // System.out.println(object);
        // }

        // list.clear();
        // System.out.println(list);

    }
}