package ir.mehdi.ood.solid.ocp.violation;

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

        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            this.result = addition.getLeft() + addition.getRight();
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            this.result = subtraction.getLeft() - subtraction.getRight();
        }
    }

    public double getResult() {
        return result;
    }
}
