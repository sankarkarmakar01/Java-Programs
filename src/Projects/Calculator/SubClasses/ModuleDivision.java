package Projects.Calculator.SubClasses;

import Projects.Calculator.Interfaces.CalculateOpeartions;

public class ModuleDivision implements CalculateOpeartions {
    @Override
    public double calculete(double num1, double num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("Division By Zero");
        }
        return num1 % num2;
    }
}
