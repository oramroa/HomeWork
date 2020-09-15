package SchoolFinal;


import java.util.Random;

public class Teacher extends Human {
    private Subject subject;
    private double certificateEvaluation; // балл в аттестате
    private Category category;
    private double qualityOfEducation; // коеффициент качества образования
    private boolean latentPotential; // скрытый потенциал (- / +)
    private double costPerDay; // стоимость в сутки

    Random random = new Random();

    /**
     * С помощью метода ordinal() получаем получаем порядковый номер константы.
     * Если порядковый номер константы равен рандомному числу, тогда переменной category присваиваем соответствующее значение константы.
     *
     * @return возвращаем значение равное текущей константе.
     */

    public Category getCategory() {
        int numberCategory = random.nextInt(4);
        if (numberCategory == Category.BEGINNER.ordinal()) this.category = Category.BEGINNER;
        if (numberCategory == Category.SECOND.ordinal()) this.category = Category.SECOND;
        if (numberCategory == Category.FIRST.ordinal()) this.category = Category.FIRST;
        if (numberCategory == Category.HIGH.ordinal()) this.category = Category.HIGH;

        return this.category;
    }

    GenerateLists records = new GenerateLists();

    public void generateTeachers(int number) {
        String male;
        String female;
        String subject;
        double markValue;

        /**
         * Получаем количество преподавателей равное введенному числу через консоль.
         * С помощью операторов if else и метода random получаем список по полу человека (рандомным образом).
         * Если значение q это четное число - добавление мужчин, иначе - добавление женщин.
         */
        for (int i = 1; i < number; i++) {
            markValue = new Teacher().getCertificateEvaluation();
            subject = new Subject().getSubName();
            male = records.getFullMaleName();
            female = records.getFullFemaleName();
            Category category = new Teacher().getCategory();
            int q = random.nextInt(55);

            if (q % 2 == 0) {
                System.out.println(i + ". " + male + category + "; Балл аттестата - " + markValue + "; Стоимость в сутки - " + new Teacher().getCostPerDay(category) + "(руб)" + "; Предмет - " + subject);
            } else {
                System.out.println(i + ". " + female + category + "; Балл аттестата - " + markValue + "; Стоимость в сутки - " + new Teacher().getCostPerDay(category) + "(руб)" + "; Предмет - " + subject);
            }
        }
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    // генерация балла аттестата (преподавателя)
    public double getCertificateEvaluation() {
        return 6 + Math.random() * 4;
    }


    public void setCertificateEvaluation(double certificateEvaluation) {
        this.certificateEvaluation = certificateEvaluation;
    }

    public double getQualityOfEducation() {
        return qualityOfEducation;
    }

    public void setQualityOfEducation(double qualityOfEducation) {
        this.qualityOfEducation = qualityOfEducation;
    }

    public boolean isLatentPotential() {
        return latentPotential;
    }

    public void setLatentPotential(boolean latentPotential) {
        this.latentPotential = latentPotential;
    }

    // генерация тарифной ставки в сутки (для преподавателя)
    public double getCostPerDay(Category category) {
        double money;
        if (category.ordinal() == 0) {
            money = Math.random() * 10 + 20;
            this.costPerDay = money;
        } else if (category.ordinal() == 1) {
            money = Math.random() * 10 + 30;
            this.costPerDay = money;
        } else if (category.ordinal() == 2) {
            money = Math.random() * 10 + 40;
            this.costPerDay = money;
        } else if (category.ordinal() == 3) {
            money = Math.random() * 10 + 50;
            this.costPerDay = money;
        }
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }
}
