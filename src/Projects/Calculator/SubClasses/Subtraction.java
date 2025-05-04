package Projects.Calculator.SubClasses;

import Projects.Calculator.Interfaces.CalculateOpeartions;

public class Subtraction implements CalculateOpeartions {
    @Override
    public double calculete(double num1, double num2) throws ArithmeticException {
        return num1 - num2;
    }
}
