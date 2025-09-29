package projects.calculatorProject.subClasses;


import projects.calculatorProject.interfaces.CalculateOperations;

public class Division implements CalculateOperations {
    @Override
    public double calculete(double num1, double num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("Division By Zero");
        }
        return num1 / num2;
    }
}
