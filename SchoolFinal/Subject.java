package SchoolFinal;

import java.util.Arrays;
import java.util.List;

public class Subject {
    private String subName;
    private Teacher teacher;

    private static final List<String> subjects = Arrays.asList("Математика", "Русский Язык", "Русская Литература", "Белорусский Язык", "Белорусская Литература",
            "Иностранный Язык", "История РБ", "Всемирная История", "Физика", "Химия", "Физкультура");

    public String getSubName() {
        return subjects.get((int) (Math.random() * 11));
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
