package ir.mehdi.ood.solid.ocp.following;

public class Subtraction implements CalculatorOperation {
    private double left;
    private double right;

    public Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    @Override
    public Double perform() {
        return this.left - this.right;
    }
}
