package pattern.decorator.client;

import pattern.decorator.Interface.Beverage;
import pattern.decorator.concreteClasses.GrandeSizeDecoratorConcrete;
import pattern.decorator.concreteClasses.HouseBlendBeverageConcrete;
import pattern.decorator.concreteClasses.MochaCondimentsDecoratorConcrete;
import pattern.decorator.concreteClasses.TallSizeDecoratorConcrete;
import pattern.decorator.concreteClasses.VentiSizeDecoratorConcrete;
import pattern.decorator.concreteClasses.WhipCondimentsDecoratorConcrete;

public class Client {

    public static void main(String[] args) {

        Beverage houseBlend = new HouseBlendBeverageConcrete();
        Beverage mocha = new MochaCondimentsDecoratorConcrete(houseBlend);
        Beverage whip = new WhipCondimentsDecoratorConcrete(mocha);

        Beverage sizeGrande = new GrandeSizeDecoratorConcrete(whip);
        System.out.println("Cost final: " + sizeGrande.getCost());
        System.out.println("Description final: " + sizeGrande.getDescription());

        Beverage sizeTall = new TallSizeDecoratorConcrete(whip);
        System.out.println("cost for tall : " + sizeTall.getCost());

        Beverage sizeVenti = new VentiSizeDecoratorConcrete(whip);
        System.out.println("cost for Venti : " + sizeVenti.getCost());


    }
}
