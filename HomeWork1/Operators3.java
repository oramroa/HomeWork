package HomeWork1;
import java.util.Scanner;


public class Operators3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name1 = scanner.nextLine();
        switch (name1) {
            case "Вася":
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, вы кто?");

        }
    }
}
