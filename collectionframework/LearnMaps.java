package collectionframework;

import java.util.*;

public class LearnMaps {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        List<Integer> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("name","Sankar");
        map.putIfAbsent("name","Sankar2");
        System.out.println(map);
        
    }
}
