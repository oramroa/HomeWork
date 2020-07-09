package HomeWork1;
import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1;
        System.out.println("Введите имя");
        name1 = scanner.nextLine();
        boolean x = true;

        if (name1.equals("Вася")) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
            x = false;

        }
        if (name1.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
            x = false;
        }
        if (x){
            System.out.println("Добрый день, вы кто?");
        }

    }
}

