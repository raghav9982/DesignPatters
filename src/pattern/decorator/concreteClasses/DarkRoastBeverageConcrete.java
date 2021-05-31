package pattern.decorator.concreteClasses;

import pattern.decorator.Interface.Beverage;

public class DarkRoastBeverageConcrete extends Beverage {
    @Override
    public int getCost() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Dark Roast ";
    }
}
