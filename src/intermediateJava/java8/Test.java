package intermediateJava.java8;

public class Test {
    public static void main(String[] args) {
        Student engineeringStudent = new Student() {
            @Override
            public String getBio(String name) {
                return name + " is Engineering Student";
            }
        };

        Student lawStudent = name -> {
            return name + " is Law Student";
        };

        String bio = engineeringStudent.getBio("Sankar");
        System.out.println(bio);
        System.out.println(lawStudent.getBio("Sankar"));
    }
}
