package coreJava.mainJava.beginnerLevel.dataTypesAndVariables.questions;

public class PersonDetails {
    public static void main(String[] args) {
        // Primitives
        int age = 20;
        double salary = 5000.75;
        char grade = 'A';
        boolean isJavaFun = true;

        // Non-Primitives
        String name = "Sankar";
        int[] marks = {85, 90, 95};

        // Prints
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Java Fun? " + isJavaFun);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
    }
}
