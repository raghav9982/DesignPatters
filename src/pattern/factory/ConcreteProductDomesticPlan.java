package pattern.factory;

public class ConcreteProductDomesticPlan extends PlanProduct {
    @Override
    protected void setPlanRate() {
        rate = 5;
    }

}
