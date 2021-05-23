package pattern.factory.plan;

public class ConcreteProductDomesticPlan extends PlanProduct {
    @Override
    protected void setPlanRate() {
        rate = 5;
    }

}
