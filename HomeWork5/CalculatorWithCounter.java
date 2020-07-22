package HomeWork5;

public class CalculatorWithCounter {
    private CalculatorWithOperator one;
    private CalculatorWithMathCopy two;
    private CalculatorWithMathExtends three;
    int currentCount = 0;


    public CalculatorWithCounter(CalculatorWithOperator one) {
        this.one = one;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy two) {
        this.two = two;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends three) {
        this.three = three;
    }

    public int getCountOperation() {
        return currentCount++;
    }

    public double division(double x, double y) {
        currentCount++;
        if (one != null) {
            return one.division(x, y);
        }
        if (three != null) {
            return three.division(x, y);
        }
        return two.division(x, y);
    }

    public double multiplication(double x, double y) {
        currentCount++;
        if (one != null) {
            return one.multiplication(x, y);
        }
        if (three != null) {
            return three.multiplication(x, y);
        }
        return two.multiplication(x, y);
    }

    // Счетчик не объявлял. Т.к. данное действие в выражении не применяется
    public double subtraction(double x, double y) {
        return x - y;
    }


    public double addition(double x, double y) {
        currentCount++;
        if (one != null) {
            return one.addition(x, y);
        }
        if (three != null) {
            return three.addition(x, y);
        }
        return two.addition(x, y);
    }

    public double involution(double x, int y) {
        currentCount++;
        if (one != null) {
            return one.involution(x, y);
        }
        if (three != null) {
            return three.involution(x, y);
        }
        return two.involution(x, y);
    }

    // Счетчик не объявлял. Т.к. данное действие в выражении не применяется
    public double module(double x) {
        //int result = (x < 0) ? -x : x;
        //return result;
        if (x < 0) {
            x = -x;
        }
        return x;
    }

    // Счетчик не объявлял. Т.к данное действие в выражении не применяется
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
