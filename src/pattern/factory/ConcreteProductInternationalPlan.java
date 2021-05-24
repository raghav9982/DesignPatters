package pattern.factory;

public class ConcreteProductInternationalPlan extends PlanProduct {
    @Override
    protected void setPlanRate() {
        rate = 7;
    }
}
