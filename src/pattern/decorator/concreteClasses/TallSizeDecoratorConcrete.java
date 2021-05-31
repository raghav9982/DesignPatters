package pattern.decorator.concreteClasses;

import pattern.decorator.Interface.Beverage;
import pattern.decorator.Decorators.CondimentsDecorator;

public class TallSizeDecoratorConcrete extends CondimentsDecorator {

    Beverage beverage;

    public TallSizeDecoratorConcrete(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + (int) 3;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Tall";
    }
}
