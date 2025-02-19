package CollectionFramework;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class CheckInternalCapacity {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        ArrayList<Integer> list = new ArrayList<>(11);

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("Array capacity: " + elementData.length);


        list.add(1);
        elementData = (Object[]) field.get(list);
        System.out.println("Array capacity: " + elementData.length);
    }
}
