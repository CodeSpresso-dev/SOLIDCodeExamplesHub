package ir.mehdi.ood.solid.ocp.following;

import java.security.InvalidParameterException;

public class CalculatorProcessor {
    private final CalculatorOperation operation;
    private double result;

    public CalculatorProcessor(CalculatorOperation calculatorOperation) {
        this.operation = calculatorOperation;
    }

    public void processCalculate() {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        result = operation.perform();
    }

    public double getResult() {
        return result;
    }
}
