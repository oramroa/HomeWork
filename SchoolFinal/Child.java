package SchoolFinal;

public class Child extends Human {
    private int classNumber;
    private Mother mother;
    private Father father;
    private double behavior; // средний балл по поведению 0 - 10
    private double progress; // средний балл по успеваемости 0 - 10
    private boolean tendencyToBeLate; // склонность к опозданию
    private int basicIq;
    private boolean latentPotential; // скрытый потенциал (- / +)
    private int budgetIncrease;

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public double getBehavior() {
        return behavior;
    }

    public void setBehavior(double behavior) {
        this.behavior = behavior;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public boolean isTendencyToBeLate() {
        return tendencyToBeLate;
    }

    public void setTendencyToBeLate(boolean tendencyToBeLate) {
        this.tendencyToBeLate = tendencyToBeLate;
    }

    public int getBasicIq() {
        return basicIq;
    }

    public void setBasicIq(int basicIq) {
        this.basicIq = basicIq;
    }

    public boolean isLatentPotential() {
        return latentPotential;
    }

    public void setLatentPotential(boolean latentPotential) {
        this.latentPotential = latentPotential;
    }

    public int getBudgetIncrease() {
        return budgetIncrease;
    }

    public void setBudgetIncrease(int budgetIncrease) {
        this.budgetIncrease = budgetIncrease;
    }
}
