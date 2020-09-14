package SchoolFinal;

public enum Category {
    BEGINNER("Начинающий специалист"),
    SECOND("Преподаватель 2-ой категории"),
    FIRST("Преподаватель 1-ой категории"),
    HIGH("Высшая категория");

    String category;

    Category(String category) {
        this.category = category;

    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return ": " + category;
    }
}
