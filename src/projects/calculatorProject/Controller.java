package projects.calculatorProject;

import projects.calculatorProject.interfaces.CalculateOperations;
import projects.calculatorProject.subClasses.*;

import java.util.*;

public class Controller {
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, CalculateOperations> operations;

    public Controller() {
        operations = new HashMap<>();
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
        operations.put("%", new ModuleDivision());
    }

    public void calculate(String choice) {
        if(!choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting...");
            return;
        }
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.print("Enter the operator (+, -, *, /, %): ");
            String operator = scanner.next();

            CalculateOperations operation = operations.get(operator);
            if(operation == null) {
                System.out.println("Invalid operator! Please use +, -, *, /, or %.");
                return;
            }

            double result = operation.calculete(num1, num2);
            System.out.printf("Result: %.2f %s %.2f = %.2f%n", num1, operator, num2, result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
            scanner.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}