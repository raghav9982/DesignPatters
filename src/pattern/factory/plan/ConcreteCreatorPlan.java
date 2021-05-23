package pattern.factory.plan;

public class ConcreteCreatorPlan {
   public static PlanProduct createPlan(String planType) {

       if (planType.equalsIgnoreCase("DOMESTIC")) {
           return new ConcreteDomesticPlan();
       }

       if (planType.equalsIgnoreCase("INTERNATIONAL")) {
           return new ConcreteInternationalPlan();
       }
       return null;
   }
}
