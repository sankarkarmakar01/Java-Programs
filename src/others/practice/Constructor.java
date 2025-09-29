package others.practice;

public class Constructor {
    Constructor(){
        System.out.println("It is a Constructor class");
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Constructor c = new Constructor();
    }
}
