package pattern.decorator.concreteClasses;

import pattern.decorator.Interface.Beverage;

public class EspressoBeverageConcrete extends Beverage {
    @Override
    public int getCost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
