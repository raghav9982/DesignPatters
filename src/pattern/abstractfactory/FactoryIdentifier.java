package pattern.abstractfactory;

public class FactoryIdentifier {

    protected static AbstractFactoryFurniture decider(String type) {
        if(type.equalsIgnoreCase("classic")) {
            return new ConcreteFactoryClassicFurniture();
        } else {
            return new ConcreteFactoryModernFurniture();
        }
    }
}
