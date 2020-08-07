package HomeWork7;

import java.util.Comparator;

public class PersonPasswordAndNickComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) { //  можно заменить на  o1 - o2.
        if (o1.getPassword().length() == o2.getPassword().length()) {
            return o1.getNick().compareTo(o2.getNick());
        }
        if (o1.getPassword().length() > o2.getPassword().length()) {
            return 1;
        }
        return -1;
    }
}