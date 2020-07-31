package HomeWork6;

import java.util.Set;
import java.util.TreeSet;

public class GenericMain {
    public static void main(String[] args) {
        DataContainer<String> data = new DataContainer<>(new String[2]);

        data.add("work1");
        data.add("work2");
        data.add("work3");
        data.add("work4");
        data.add("work5");

        for (String str : data.getItems()) {
            System.out.println(str);
        }
        System.out.println();

        data.deleteIndex(0);
        for (String str1 : data.getItems()) {
            System.out.println(str1);
        }
        System.out.println();

        data.deleteElement("work3");
        for (String str2 : data.getItems()) {
            System.out.println(str2);
        }
    }
}
