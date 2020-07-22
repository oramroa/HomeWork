package HomeWork5;

public class CalculatorWithOperator {


    public double division(double x, double y) {
        return x / y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public double addition(double x, double y) {
        return x + y;
    }

    public double involution(double x, int y) {
        double result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * x;
        }
        return result;
    }

    public double module(double x) {
        //int result = (x < 0) ? -x : x;
        //return result;
        if (x < 0) {
            x = -x;
        }
        return x;
    }

    public double rootOfNum(double x) {
        double y;
        double squareRoot = x / 2;
        do {
            y = squareRoot;
            squareRoot = (y + (x / y)) / 2;
        } while ((y - squareRoot) != 0);
        return squareRoot;
    }

}