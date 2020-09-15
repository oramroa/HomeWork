package SchoolFinal;

import java.util.*;

public class TestGame {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("Выберите уровень сложности:\n1. Легко\n2. Средне\n3. Сложно");
        Scanner scanner = new Scanner(System.in);

        /**
         * В данном случае есть связь и можем использовать карту.
         * Сразу проверяем введенное значение на валидность, чтобы карта принимала уже необходимое значение.
         * По ключу (1, 2, 3) достаем значение из карты и передаем его (num) в метод generateTeachers.
         */
        Map<Integer, Integer> number = new HashMap<>();
        number.put(1, 26);
        number.put(2, 18);
        number.put(3, 11);

        int a = 0;
        do {
            try {
                a = scanner.nextInt();
                if (a < 1 | a > 3) {
                    System.out.println("Повторите попытку");
                }
                int num = number.get(a);
                teacher.generateTeachers(num);
            } catch (NullPointerException ignored) {
            }
        } while (!(a > 0 & a < 4));


        // альтернативное решение с помощью оператора if else
//        int a;
//        do {
//            a = scanner.nextInt();
//            if (a == 1) {
//                teacher.generateTeachers(26);
//            } else if (a == 2) {
//                teacher.generateTeachers(18);
//            } else if (a == 3) {
//                teacher.generateTeachers(11);
//            }
//            if (a < 1 | a > 3) {
//                System.out.println("Повторите попытку");
//            }
//        } while (!(a > 0 & a < 4));
    }
}


