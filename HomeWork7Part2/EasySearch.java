package HomeWork7Part2;

public class EasySearch implements ISearchEngine {


    @Override
    public int search(String bk, String word) {
        String str = bk.toLowerCase();
        String sts = word.toLowerCase();
        int i;
        int index = 0;
        int count = 0;
        do {
            i = str.indexOf(sts, index);
            if (i != -1) count++;
            index = i + sts.length();
        } while (i != -1);
        return count;
    }

}
