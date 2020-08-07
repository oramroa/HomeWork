package HomeWork7;

import java.util.Comparator;

public class PersonPasswordComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) { //  можно заменить на  o1 - o2.
        if (o1.getPassword().length() == o2.getPassword().length()) {
            return 0;
        }
        if (o1.getPassword().length() > o2.getPassword().length()) {
            return 1;
        }
        return -1;
    }
}
