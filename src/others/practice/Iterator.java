package others.practice;

import java.util.*;

public class Iterator {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        // for (int i = 0; i < fruits.size(); i++) {
        // System.out.println(fruits.get(i));
        // }

        // for(String i:fruits){
        // System.out.println(i);
        // }

        // Iterator<String> fe = fruits.iterator();

        // while (fe.hasNext()) {
        // System.out.println("iteratror " + fe.next());
        // }

        List<String> smalllist = fruits.subList(0, 3);
        System.out.println(smalllist);

    }
}
