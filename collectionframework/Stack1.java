package collectionframework;

import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();

        fruits.push("Sankar");
        fruits.push("Karkmakar");

        System.out.println(fruits);

        fruits.pop();
        System.out.println(fruits);

        System.out.println(fruits.peek());

        System.out.println(fruits.isEmpty());
    }
}
