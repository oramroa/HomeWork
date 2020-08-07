package HomeWork7Part2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RegExSearchMain {
    public static void main(String[] args) {

        String filePath = "Война и мир_книга.txt";

        String book = readAllBytesJava7(filePath);

        RegExSearch regExSearch = new RegExSearch();
        System.out.println("Союз " + "'и'" + " встречается " + (regExSearch.search(book, " и ") + " раз.")); // 13221 раз
        System.out.println("Слово " + "'война'" + " встречается " + (regExSearch.search(book, "война") + " раз.")); // 51 раз
        System.out.println("Слово " + "'мир'" + " встречается " + (regExSearch.search(book, "мир") + " раза.")); // 294 раза

    }

    private static String readAllBytesJava7(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}

