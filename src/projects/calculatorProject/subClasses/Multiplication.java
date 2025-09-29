package projects.calculatorProject.subClasses;


import projects.calculatorProject.interfaces.CalculateOperations;

public class Multiplication implements CalculateOperations {
    @Override
    public double calculete(double num1, double num2) throws ArithmeticException {
        return num1 * num2;
    }
}
