package coreJava.basics.dataTypesAndVariables;

public class NonPrimitives {
    public static void main(String[] args) {
        String name1 = new String("Sankar");
        String name2 = "Sankar Karmakar";
        System.out.println(name1);
        System.out.println(name2);

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
