package pattern.factory;

public class ConcreteCreatorPlan {
   public static PlanProduct createPlan(String planType) {

       if (planType.equalsIgnoreCase("DOMESTIC")) {
           return new ConcreteProductDomesticPlan();
       }

       if (planType.equalsIgnoreCase("INTERNATIONAL")) {
           return new ConcreteProductInternationalPlan();
       }
       return null;
   }
}
