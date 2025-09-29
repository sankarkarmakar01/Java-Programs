package others.dataStructuresAndAlgorithms.shashCode.array;

public class MyArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 54;

        insert(arr,1,20);
        printArray(arr);
        delete(arr,0);
        printArray(arr);
    }
    public static void printArray(int arr[]) {
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void insert(int arr[], int pos, int element) {
        int size = arr.length;
        if(pos < 0 && pos > size - 1 ){
            System.out.println("Wrong position");
            return;
        }
        // shifting towards the end
        for(int i = size-2;i>=pos;i--) {
            arr[i+1] = arr[i];
        }
        arr[pos] = element;
    }

    public static void delete(int arr[], int pos) {
        // shifting towards starting index
        for(int i = pos;i <= arr.length - 2;i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
    }
}
