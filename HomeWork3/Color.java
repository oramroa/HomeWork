package HomeWork3;

public class Color {
    private String name;
    private int number;

    final int RED = 1;
    final int ORANGE = 2;
    final int YELLOW = 3;
    final int GREEN = 4;
    final int BLUE = 5;
    final int INDIGO = 6;
    final int VIOLET = 7;

    public Color(int number) {
        this.number = number;

    }

    public String getName() {

        switch (number) {
            case RED:
                return "Красный";
            case ORANGE:
                return "Оранжевый";
            case YELLOW:
                return "Желтый";
            case GREEN:
                return "Зелёный";
            case BLUE:
                return "Голубой";
            case INDIGO:
                return "Синий";
            case VIOLET:
                return "Фиолетовый";
            default:
                return "неизвестно";

        }
    }

    public int getNumber() {

        return number;
    }
}
