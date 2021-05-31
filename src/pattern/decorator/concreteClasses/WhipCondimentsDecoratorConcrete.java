package pattern.decorator.concreteClasses;

import pattern.decorator.Interface.Beverage;
import pattern.decorator.Decorators.CondimentsDecorator;

public class WhipCondimentsDecoratorConcrete extends CondimentsDecorator {

    Beverage beverage;

     public WhipCondimentsDecoratorConcrete(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost() + (int) 1;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " ,Whip";
    }
}
