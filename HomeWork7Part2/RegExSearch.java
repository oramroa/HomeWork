package HomeWork7Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExSearch implements ISearchEngine {

    @Override
    public int search(String bk, String word) {
        Pattern pattern = Pattern.compile(word);
        Matcher mtch = pattern.matcher(bk);
        int count = 0;

        while (mtch.find()) {
            count++;
        }
        return count;
    }
}