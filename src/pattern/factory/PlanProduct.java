package pattern.factory;

public abstract class PlanProduct {

    int rate;

    abstract void setPlanRate();

    public int getCost(int units) {
        return units * rate;
    }
}
