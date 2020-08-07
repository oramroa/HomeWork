package HomeWork7;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) { //  можно заменить на  o1 - o2.
        if (o1.getAge() == o2.getAge()) {
            return 0;
        }
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        return -1;
    }
}