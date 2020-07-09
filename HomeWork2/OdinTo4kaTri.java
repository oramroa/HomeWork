package HomeWork2;

import java.util.Scanner;

public class OdinTo4kaTri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        double a = scanner.nextDouble();
        for (; a != (long) a || a == 0;) {
            System.out.println("Вы ввели неверное число, введите еoе раз");
            a = scanner.nextDouble();
        }
        int lenght = 0;
        for (long random = 1; random <= Math.abs(a); lenght++) {
            random = random * 10;

        }
        System.out.println("Количество элементов в числе " + (long) a + " = " + lenght);

        String b = Long.toString((long) Math.abs(a));
        long c = Long.parseLong(reverseString(b));

        long element;
        int stepen = 1;
        long result = 1;
        for (int d = 1; d <=lenght; ) {
            element = (c) / stepen % 10;
            stepen = stepen * 10;
            result = result * element;
            if (d < lenght) {
                System.out.println(element + " * ");
            }else {
                System.out.println((element));
            }
            d++;
        }
        System.out.println(" = " + result);
    }
    public static String reverseString(String a) {
        return new StringBuilder(a).reverse().toString();
    }
}
