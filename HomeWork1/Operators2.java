package HomeWork1;
import java.util.Scanner;

public class Operators2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1;
        System.out.println("Введите имя");
        name1 = scanner.nextLine();

        if (name1.equals("Вася")) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");

        }else if (name1.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");

        }else {
            System.out.println("Добрый день, вы кто?");
        }
        
        
    }
}
