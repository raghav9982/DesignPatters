package pattern.factory;

public class CreatorFactoryPattern {
    public static void main(String[] args) {

        PlanProduct planDomestic = ConcreteCreatorPlan.createPlan("DOMESTIC");
        if (planDomestic != null) {
            planDomestic.setPlanRate();
            System.out.println("Plan cost for Domestic plan : " + planDomestic.getCost(25));
        }


        PlanProduct planInternational = ConcreteCreatorPlan.createPlan("INTERNATIONAL");
        if (planInternational != null) {
            planInternational.setPlanRate();
            System.out.println("Plan cost for Domestic plan : " + planInternational.getCost(25));
        }

    }
}
