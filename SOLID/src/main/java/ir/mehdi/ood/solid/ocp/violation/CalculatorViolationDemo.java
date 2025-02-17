package ir.mehdi.ood.solid.ocp.violation;

public class CalculatorViolationDemo {
    public static void main(String[] args) {
        CalculatorOperation additionOperation = new Addition(12,13);
        CalculatorProcessor calculatorProcessor = new CalculatorProcessor(additionOperation);
        calculatorProcessor.processCalculate();
        System.out.println(calculatorProcessor.getResult());
    }
}
