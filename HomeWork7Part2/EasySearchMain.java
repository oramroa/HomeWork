package HomeWork7Part2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearchMain {
    public static void main(String[] args) {
        String filePath = "Война и мир_книга.txt";

        String book = readAllBytesJava7(filePath);

        EasySearch easySearch = new EasySearch();
        System.out.println("Союз " + "'и'" + " встречается " + (easySearch.search(book, " и ") + " раз.")); // 13221 раз / без учета регистра 13883 раза
        System.out.println("Слово " + "'война'" + " встречается " + (easySearch.search(book, "война") + " раз.")); // 51 раз / без учета регистра 57 раз
        System.out.println("Слово " + "'мир'" + " встречается " + (easySearch.search(book, "мир") + " раза.")); // 294 раза / без учета регистра 298 раз

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
