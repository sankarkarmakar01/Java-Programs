package DataStructuresAndAlgorithms.Maths;

import java.util.ArrayList;
import java.util.List;
//Wrong
public class WarOfUnitPlace {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(9);
        arr.add(7);
        System.out.println(arr);

        long ans = 0;
        int size = arr.size();
        int i = 0;
        while(i<=size){
            ans = arr.get(i) * (int)(Math.pow(10,size));
            System.out.println(ans);
            size--;
            i++;
        }
    }
}
