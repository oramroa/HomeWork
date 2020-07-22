package HomeWork5;

public class CalculatorWithMemory {
    private CalculatorWithOperator one;
    private CalculatorWithMathCopy two;
    private CalculatorWithMathExtends three;
    int currentCount = 0;
    double firstMem = 0;
    double secondMem = 0;


    public CalculatorWithMemory(CalculatorWithOperator one) {
        this.one = one;
    }

    public CalculatorWithMemory(CalculatorWithMathCopy two) {
        this.two = two;
    }

    public CalculatorWithMemory(CalculatorWithMathExtends three) {
        this.three = three;
    }

    public int getCountOperation() {
        return currentCount++;
    }

    public double division(double x, double y) {
        currentCount++;
        if (one != null) {
            return firstMem = one.division(x, y);
        }
        if (three != null) {
            return firstMem = three.division(x, y);
        }
        return firstMem = two.division(x, y);
    }

    public double multiplication(double x, double y) {
        currentCount++;
        if (one != null) {
            return firstMem = one.multiplication(x, y);
        }
        if (three != null) {
            return firstMem = three.multiplication(x, y);
        }
        return firstMem = two.multiplication(x, y);
    }

    // Счетчик не объявлял. Т.к. данное действие в выражении не применяется
    public double subtraction(double x, double y) {
        return x - y;
    }


    public double addition(double x, double y) {
        currentCount++;
        if (one != null) {
            return firstMem = one.addition(x, y);
        }
        if (three != null) {
            return firstMem = three.addition(x, y);
        }
        return firstMem = two.addition(x, y);
    }

    public double involution(double x, int y) {
        currentCount++;
        if (one != null) {
            return firstMem = one.involution(x, y);
        }
        if (three != null) {
            return firstMem = three.involution(x, y);
        }
        return firstMem = two.involution(x, y);
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

    public double toMemory() {
        secondMem = firstMem;
        return fromMemory();
    }

    public double fromMemory() {
        double dob = 0;
        dob = secondMem;
        firstMem = 0;
        return dob;

    }

}
