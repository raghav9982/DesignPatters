package pattern.decorator.concreteClasses;

import pattern.decorator.Interface.Beverage;
import pattern.decorator.Decorators.CondimentsDecorator;

public class VentiSizeDecoratorConcrete extends CondimentsDecorator {

    Beverage beverage;
    public VentiSizeDecoratorConcrete(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return this.beverage.getCost() + (int) 7;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Venti";
    }
}
