package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {

        System.out.println("Введите количество колец, не менее 3:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (; a < 3; ) {
            System.out.println("Вы ввели неправильное значение, попробуйте еще раз");
            a = scanner.nextInt();
        }

        String[][] array = new String[a][3];

        for (int i = a; i > 0; i--) {
            array[i - 1][0] = Integer.toString(i);
            array[i - 1][1] = "*";
            array[i - 1][2] = "*";
        }

        String[][] array2 = new String[a][3];
        for (int i = a; i > 0; i--) {
            array2[i - 1][1] = Integer.toString(i);
            array2[i - 1][0] = "*";
            array2[i - 1][2] = "*";
        }
        String[][] array3 = new String[a][3];
        for (int i = a; i > 0; i--) {
            array3[i - 1][2] = Integer.toString(i);
            array3[i - 1][0] = "*";
            array3[i - 1][1] = "*";
        }
        //
        for (; !Arrays.deepEquals(array, array2) && !Arrays.deepEquals(array, array3); ) {

            //Выводим игровое поле(массив)

            System.out.println("Игровое поле:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();

            }
            Scanner scanner1 = new Scanner(System.in);

            /**
             * Вводим номер кольца для перемещения. Проверяем номер кольца на соответсвие/несоответствие условию
             */
            System.out.println("Выберите кольцо, которое хотите переместить:");
            String b = scanner1.nextLine();
            for (; Integer.parseInt(b) < 1 || Integer.parseInt(b) > a; ) {
                System.out.println("Такого кольца нет. Введите снова");
                b = scanner1.nextLine();

            }

            /**
             * Вводим номер стержя для перемещения кольца. Проверяем номер стержня на соответствие/несоответствие условию
             */
            System.out.println("На какой стержень перемещаем кольцо " + b + "?");
            String c = scanner1.nextLine();
            for (; Integer.parseInt(c) > 3 || Integer.parseInt(c) < 1; ) {
                System.out.println("Такого стержня не существует. Повторите попытку");
                c = scanner1.nextLine();
            }
            /**
             * Замена и перемещение колец
             */
            for (int i = 0; i < array.length; i++) {
                boolean bool = false;
                for (int j = 0; j < array[i].length; j++) {
                    if (b.equals(array[i][j])) {
                        if (i == 0 || array[i - 1][j].equals("*")) {
                            for (int k = a; k >= 1; k--) {
                                if (array[k - 1][Integer.parseInt(c) - 1].equals("*")) {
                                    String d = array[i][j];
                                    array[i][j] = array[k - 1][Integer.parseInt(c) - 1];
                                    array[k - 1][Integer.parseInt(c) - 1] = d;
                                    bool = true;
                                    break;
                                } else if (Integer.parseInt(array[k - 1][Integer.parseInt(c) - 1]) > Integer.parseInt(array[i][j])) {
                                    continue;
                                } else
                                    System.out.println("Кольцо № " + b + " нельзя перемещать на " + c + " стержень");
                                bool = true;
                                break;
                            }
                        } else {
                            System.out.println("Это кольцо нельзя перемещать!");
                            bool = true;
                            break;
                        }
                    }
                }
                if (bool) {
                    break;
                }
            }
        }

        /**
         * Выводим результат решения задачи
         */
        System.out.println("Поздравляем. Вы выиграли текущую игру");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
