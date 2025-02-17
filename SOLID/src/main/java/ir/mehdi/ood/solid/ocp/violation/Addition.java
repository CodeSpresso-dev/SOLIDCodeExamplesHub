package ir.mehdi.ood.solid.ocp.violation;

public class Addition implements CalculatorOperation{
    private double left;
    private double right;

    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }
}
