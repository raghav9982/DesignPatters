package pattern.decorator.concreteClasses;

import pattern.decorator.Interface.Beverage;

public class HouseBlendBeverageConcrete extends Beverage {
    @Override
    public int getCost() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "HouseBlend";
    }
}
