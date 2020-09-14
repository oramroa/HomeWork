package SchoolFinal;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GenerateLists {
    private static final List<String> maleName = Arrays.asList("Антон", "Аркадий", "Арнольд", "Арсен", "Артур", "Афанасий", "Ашот",
            "Архип", "Вальтер", "Вениамин", "Евграф", "Евлампий", "Евстигней", "Захар", "Игнатий");
    private static final List<String> femaleName = Arrays.asList("Агафья", "Аглая", "Алевтина", "Алина", "Алла", "Анфиса", "Галина",
            "Евлампия", "Жанна", "Клавдия", "Марфа", "Матрена", "Римма", "София", "Урсула");
    private static final List<String> maleSurname = Arrays.asList("Жук", "Мухин", "Баранов", "Козлов", "Курицын", "Муравьев", "Лебедев",
            "Орлов", "Зайцев", "Щукин", "Медведев", "Горохов", "Бобов", "Репин", "Орехов");
    private static final List<String> femaleSurname = Arrays.asList("Жук", "Мухина", "Баранова", "Козлова", "Курицына", "Муравьева", "Лебедева",
            "Орлова", "Зайцева", "Щукина", "Медведева", "Горохова", "Бобова", "Репина", "Орехова");
    private static final List<String> mPatronymic = Arrays.asList("Антонов", "Аркадьевич", "Арнольдович", "Арсенович", "Артурович", "Афанасьевич", "Ашотович",
            "Архипович", "Вальтерович", "Вениаминович", "Евграфович", "Евлампиевич", "Евстигнеевич", "Захарович", "Игнатьевич");
    private static final List<String> fPatronymic = Arrays.asList("Антоновна", "Аркадьевна", "Арнольдовна", "Арсеновна", "Артуровна", "Афанасьевна", "Ашотовна",
            "Архиповна", "Вальтеровна", "Вениаминовна", "Евграфовна", "Евлампиевна", "Евстигнеевна", "Захаровна", "Игнатьевна");


    private static final List<String> subjects = Arrays.asList("Математика", "Русский Язык", "Русская Литература", "Белорусский Язык", "Белорусская Литература",
            "Иностранный Язык", "История РБ", "Всемирная История", "Физика", "Химия", "Физкультура");

    // генерация ФИО (мужчин)
    public String getFullMaleName() {
        Random random = new Random();
        return maleSurname.get(random.nextInt(maleSurname.size())) + " " +
                maleName.get(random.nextInt(maleName.size())) + " " + mPatronymic.get(random.nextInt(mPatronymic.size()));
    }

    // генерация ФИО (женщин)
    public String getFullFemaleName() {
        Random random = new Random();
        return femaleSurname.get(random.nextInt(femaleSurname.size())) + " " +
                femaleName.get(random.nextInt(femaleName.size())) + " " + fPatronymic.get(random.nextInt(fPatronymic.size()));
    }

    // генерация предметов
    String getSubject() {
        return subjects.get((int) (Math.random() * 11));
    }


}
