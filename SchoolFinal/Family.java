package SchoolFinal;

import java.util.List;

public class Family {
    private Mother mother;
    private Father father;
    private List<Child> child;
    private int budget; // семейный бюджет
    private int budgetIncrease; // прирост бюджета в день

    public Family(Mother mother, Father father, List<Child> children) {
        this.mother = mother;
        this.father = father;
        this.child = children;
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

    public List<Child> getChildren() {
        return child;
    }

    public void setChildren(List<Child> children) {
        this.child = children;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudgetIncrease() {
        return budgetIncrease;
    }

    public void setBudgetIncrease(int budgetIncrease) {
        this.budgetIncrease = budgetIncrease;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", child=" + child +
                ", budget=" + budget +
                ", budgetIncrease=" + budgetIncrease +
                '}';
    }
}
