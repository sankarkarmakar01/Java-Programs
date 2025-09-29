package others.practice;

public class Exceptions {
    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.println("Hello guys");

        try {
            @SuppressWarnings("unused")
            int result = 5 / 0;
            System.out.println(a[8]);

            // } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            // System.out.println("Handling Exception");
            // } catch(RuntimeException e){

        }

        catch (Exception e) {
            System.out.println("All exceptions handled");
        }

        System.out.println("Bye guys");
    }
}