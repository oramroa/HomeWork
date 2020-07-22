package HomeWork5;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    public double involution(double x, int y) {
        return Math.pow(x, y);
    }


    public double module(double x) {
        return Math.abs(x);
    }


    public double rootOfNum(double x) {
        return Math.sqrt(x);
    }
}

