package pattern.decorator.concreteClasses;

import pattern.decorator.Interface.Beverage;
import pattern.decorator.Decorators.CondimentsDecorator;

public class MochaCondimentsDecoratorConcrete extends CondimentsDecorator {

    Beverage beverage;

    public MochaCondimentsDecoratorConcrete(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + (int) 2;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
