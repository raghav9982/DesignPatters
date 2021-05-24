package pattern.abstractfactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcreteFactoryModernFurniture extends AbstractFactoryFurniture {

    public ProductSofa getProductSofa() {
        return new ConcreteProductModernSofa();
    }

    public ProductTable getProductTable() {
        return new ConcreteProductModernTable();
    }
}
