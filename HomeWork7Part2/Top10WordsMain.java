package HomeWork7Part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class Top10WordsMain {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> wordCount = new LinkedHashMap<>();
        String filePath = "Война и мир_книга.txt";
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            String str;

            while ((str = in.readLine()) != null) {
                str = str.toLowerCase(); // преобразование в нижний регистр
                str = str.replaceAll("[^\\p{L}\\p{Z}]", "");// игнорируем \\p{L} - любые буквы и \\p{Z} любые пробелы или невидимые разделители
                String[] words = str.split("[\\s]");

                for (String word : words) {
                    if (word.length() == 0) {
                        continue;
                    }

                    Integer occurences = wordCount.get(word);

                    if (occurences == null) {
                        occurences = 1;
                    } else {
                        occurences++;
                    }

                    wordCount.put(word, occurences);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(wordCount.values());

        Collections.sort(values, Collections.reverseOrder()); // применен компаратор обратного порядка,
        // чтобы порядок элементов не изменился при равенстве значений(элементов)

        int last_i = -1;

        for (Integer i : values.subList(0, 10)) {
            if (last_i == i)
                continue;
            last_i = i;

            for (String s : wordCount.keySet()) {

                if (wordCount.get(s) == i)
                    System.out.println(s + " " + i);
            }
        }
    }
}