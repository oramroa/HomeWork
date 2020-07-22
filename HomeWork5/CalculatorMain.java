package HomeWork5;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        CalculatorWithMathCopy calc1 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calc2 = new CalculatorWithMathExtends();
        CalculatorWithCounter calc3 = new CalculatorWithCounter(new CalculatorWithMathCopy());
        CalculatorWithMemory calc4 = new CalculatorWithMemory(new CalculatorWithMathCopy());


        double result1 = calc.addition(4.1, calc.addition(calc.multiplication(15, 7), calc.involution(calc.division(28, 5), 2)));

        double result2 = calc1.addition(4.1, calc1.addition(calc1.multiplication(15, 7), calc1.involution(calc1.division(28, 5), 2)));

        double result3 = calc2.addition(4.1, calc2.addition(calc2.multiplication(15, 7), calc2.involution(calc2.division(28, 5), 2)));

        double result4 = calc3.addition(4.1, calc3.addition(calc3.multiplication(15, 7), calc3.involution(calc3.division(28, 5), 2)));

        System.out.println("_____ Для класса CalculatorWithOperator _____ ");
        System.out.println("Результат выражения: " + result1);
        System.out.println("Результат деления на ноль: " + calc.division(result1, 0));
        System.out.println("Результат деления на 0.0d: " + calc.division(result1, 0.0d) + "\n");

        System.out.println("_____ Для класса CalculatorWithMathCopy _____");
        System.out.println("Результат выражения: " + result2);
        System.out.println("Результат деления на ноль: " + calc1.division(result2, 0));
        System.out.println("Результат деления на 0.0d: " + calc1.division(result2, 0.0d) + "\n");

        System.out.println("_____ Для класса CalculatorWithMathExtends _____");
        System.out.println("Результат выражения: " + result3);
        System.out.println("Результат деления на ноль: " + calc2.division(result3, 0));
        System.out.println("Результат деления на 0.0d: " + calc2.division(result3, 0.0d) + "\n");


        System.out.println("_____ Для класса CalculatorWithCounter _____");
        System.out.println("Результат выражения: " + result4);
        System.out.println("Результат деления на ноль: " + calc3.division(result4, 0));
        System.out.println("Результат деления на 0.0d: " + calc3.division(result4, 0.0d));
        System.out.println("Количество операций: " + calc3.getCountOperation() + "\n");


        System.out.println("_____ Для класса CalculatorWithMemory _____");
        calc4.division(28, 5);
        calc4.toMemory();
        calc4.involution(calc4.fromMemory(), 2);
        calc4.toMemory();
        calc4.addition(calc4.fromMemory(), calc4.multiplication(15, 7));
        calc4.toMemory();
        double result5 = calc4.addition(calc4.fromMemory(), 4.1);
        System.out.println("Результат выражения: " + result5);
        System.out.println("Результат деления на ноль: " + calc4.division(result5, 0));
        System.out.println("Результат деления на 0.0d: " + calc4.division(result5, 0.0d));
        System.out.println("Количество операций: " + calc4.getCountOperation());


    }
}

