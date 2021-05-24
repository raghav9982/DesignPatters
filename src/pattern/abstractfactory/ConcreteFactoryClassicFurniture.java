package pattern.abstractfactory;

import java.util.Arrays;
import java.util.List;

public class ConcreteFactoryClassicFurniture extends AbstractFactoryFurniture {


    public ProductSofa getProductSofa() {
        return new ConcreteProductClassicSofa();
    }

    public ProductTable getProductTable() {
        return new ConcreteProductClassicTable();

    }
}
