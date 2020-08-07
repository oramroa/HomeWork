package HomeWork7;

import java.util.Comparator;

public class AnimalAgeAndNickComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) { //  можно заменить на  o1 - o2.
        if (o1.getAge() == o2.getAge()) {
            return o1.getNick().compareTo(o2.getNick());
        }
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        return -1;
    }
}