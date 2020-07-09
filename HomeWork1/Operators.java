package HomeWork1;

public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        boolean x = true;
        boolean y = false;
        System.out.println(a + b / c); // = 5; Вначале выполняем деление (int не хранит дробные числа - поэтому ответ приделении 0), а потом сложение
        System.out.println((a + b) /c); // = 0; Вначале выполняем действие в скобках, а затем деление (int не хранит дробные числа - ответ при делении 0)
        System.out.println((a + b++) /c); // = 0; Вначале выполняем действие в скобках, b++ = 2; при делении получаем дробное число
        System.out.println((a + b++)/ --c); // = 1; Действие в скобках, затем деление на 7 (--с)
        System.out.println((a * b >> b++)/--c); // = 0; Вначале умножение,
        // затем сдвигаем двоичное число 1010 на два знака вправо - это равно двум. 2 / 7 - будет дробное число
         a = 5;
         b = 2;
         c = 8;
        System.out.println((a + 7 > 20 ? 68 : 22 * b >> b++) / --c); // = 1;  Сумма меньше 20, тогда 22 * 2 = 44,
        // двоичное число 101100 сдвигаем на 2 знака вправо и получаем 1011 (число 11), делим его на 7.

        // System.out.println((a + 7 > 20 ? 68 >= 68 : 22 * b >> b++) / --c); // = ошибка компиляции, 68 >= 68

        System.out.println(6 - b > 3 && 12 * 12 <=119); // = false; 6 - 2 > 3 (true) AND 12 * 2 <= 119 (false). true * false = false
        System.out.println(x && y); // = false; true AND false = false.






    }
}
