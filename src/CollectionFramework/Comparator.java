//package CollectionFramework;
//
//import java.util.*;
//
//class CompareInteger implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o1 - o2;
//    }
//}
//
//public abstract class Comparator<I extends Number> {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(3);
//        list.add(35);
//
//        list.sort(new CompareInteger());
//        System.out.println(list);
//    }
//
//    public abstract int compare(Integer o1, Integer o2);
//}
