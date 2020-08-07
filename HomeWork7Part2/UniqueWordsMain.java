package HomeWork7Part2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueWordsMain {
    public static void main(String[] args) {
        String filePath = "Война и мир_книга.txt";
        String book = readAllBytesJava7(filePath);

        String toLowerCase = book.toLowerCase();

        String regex = "[а-я]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(toLowerCase); // преобразование в нижний регистр

        Set<String> list = new HashSet<>();

        while (matcher.find()) {
            list.add(matcher.group());

        }
        System.out.println("Количество уникальных слов: " + list.size());
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