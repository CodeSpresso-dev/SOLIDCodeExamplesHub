package ir.mehdi.ood.solid.ocp.following;

public class CalculatorFollowingDemo {
    public static void main(String[] args) {
        CalculatorOperation additionOperation = new Addition(12,13);
        CalculatorProcessor calculatorProcessor = new CalculatorProcessor(additionOperation);
        calculatorProcessor.processCalculate();
        System.out.println(calculatorProcessor.getResult());
    }
}
