package HomeWork7;

import java.util.*;

public class ListMain {
    public static void main(String[] args) {
        // Person
        List<Person> listOfPerson = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            listOfPerson.add(new Person(RandomString.random(10), RandomString.random(RandomString.generateRage(5, 10))));
        }
        long end = System.currentTimeMillis();
        System.out.println("Разница в миллисекундах при добавлении(LinkedList): " + (end - start));// разница в миллисекундах = 1484
        System.out.println(listOfPerson);
        System.out.println(listOfPerson.get(65).getNick());
        System.out.println(listOfPerson.get(50).getPassword());

        Iterator<Person> iterator = listOfPerson.iterator();
        long start1 = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Разница в миллисекундах(LinkedList) при удалении: " + (end1 - start1)); // разница в миллисекундах = 28
        System.out.println("Размер списка Person после удаления равен: " + listOfPerson.size());

        PersonPasswordComparator personPasswordComparator = new PersonPasswordComparator();
        listOfPerson.sort(personPasswordComparator);

        System.out.println("Sort by password length:");
        for (Person ofPerson : listOfPerson) {
            System.out.println(ofPerson);
        }
        System.out.println();


        PersonPasswordAndNickComparator personPasswordAndNickComparator = new PersonPasswordAndNickComparator();
        listOfPerson.sort(personPasswordAndNickComparator);

        System.out.println("Sort by password length and nick:");
        for (Person person : listOfPerson) {
            System.out.println(person);
        }
        System.out.println();

        // Animal
        List<Animal> listOfAnimal = new ArrayList<>();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            listOfAnimal.add(new Animal(RandomString.generateRage(1, 15), RandomString.random(7)));
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Разница в миллисекундах(ArrayList): " + (end2 - start2)); // разница в миллисекундах = 966
        System.out.println(listOfAnimal + "\n");
        System.out.println(listOfAnimal.get(40).getAge());
        System.out.println(listOfAnimal.get(69).getNick());

        long start3 = System.currentTimeMillis();
        for (int j = listOfAnimal.size() - 1; j >= 0; j--) {
            listOfAnimal.remove(j);
        }
        long end3 = System.currentTimeMillis();
        System.out.println("Разница в миллисекундах(ArrayList) при удалении: " + (end3 - start3)); // разница в миллисекундах = 21
        System.out.println("Размер списка Animal после удаления равен: " + listOfAnimal.size());


        AnimalAgeComparator animalAgeComparator = new AnimalAgeComparator();
        listOfAnimal.sort(animalAgeComparator);

        System.out.println("Sort by age of animals:");
        for (Animal ofAnimal : listOfAnimal) {
            System.out.println(ofAnimal);
        }
        System.out.println();


        AnimalAgeAndNickComparator animalAgeAndNickComparator = new AnimalAgeAndNickComparator();
        listOfAnimal.sort(animalAgeAndNickComparator);

        System.out.println("Sort by age of animals and nick:");
        for (Animal animal : listOfAnimal) {
            System.out.println(animal);
        }
    }
}

