package pattern.decorator.concreteClasses;

import pattern.decorator.Interface.Beverage;
import pattern.decorator.Decorators.CondimentsDecorator;

public class GrandeSizeDecoratorConcrete extends CondimentsDecorator {

    Beverage beverage;
    public GrandeSizeDecoratorConcrete(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return this.beverage.getCost() + (int) 5;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Grande";
    }
}
