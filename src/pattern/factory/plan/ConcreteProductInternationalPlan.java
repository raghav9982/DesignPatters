package pattern.factory.plan;

public class ConcreteProductInternationalPlan extends PlanProduct {
    @Override
    protected void setPlanRate() {
        rate = 7;
    }
}
