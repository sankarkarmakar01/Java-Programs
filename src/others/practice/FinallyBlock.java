package others.practice;

public class FinallyBlock {
    public static void main(String[] args) {
        int a[] = new int[5];

        // System.out.println("Hello World");
        // try {
        // System.out.println(a[8]);
        // } catch (Exception e) {
        // System.out.println("Exceptions Handled");
        // }

        // finally {
        // System.out.println("I will run always");
        // }
        // System.out.println("Bye");
        try {
            gerNumberFormArray(a);
        } catch (Exception e) {
            System.out.println("Catched the exception " + e.getMessage());
        }

    }

    static int gerNumberFormArray(int a[]) throws ArithmeticException {
        return a[8];
    }

}
