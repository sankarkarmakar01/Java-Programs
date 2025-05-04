package CollectionFramework;

import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.add(40);
        queue.add(12);
        queue.add(24);
        queue.add(36);

        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
    }
}
