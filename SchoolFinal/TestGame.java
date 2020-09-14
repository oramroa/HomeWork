package SchoolFinal;

import java.util.*;

public class TestGame {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("Выберите уровень сложности:\n1. Легко\n2. Средне\n3. Сложно");
        Scanner scanner = new Scanner(System.in);

        int a;
        do {
            a = scanner.nextInt();
            if (a == 1) {
                teacher.generateTeachers(26);
            } else if (a == 2) {
                teacher.generateTeachers(18);
            } else if (a == 3) {
                teacher.generateTeachers(11);
            }
            if (a < 1 | a > 3) {
                System.out.println("Повторите попытку");
            }
        } while (!(a > 0 & a < 4));
    }
}

