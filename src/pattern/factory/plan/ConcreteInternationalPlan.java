package pattern.factory.plan;

public class ConcreteInternationalPlan extends PlanProduct {
    @Override
    protected void setPlanRate() {
        rate = 7;
    }
}
