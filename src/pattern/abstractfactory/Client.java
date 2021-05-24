package pattern.abstractfactory;

public class Client {

    public static void main(String[] args) {
        String type = "Classics";

        AbstractFactoryFurniture furniture = FactoryIdentifier.decider(type);
        ProductSofa productSofa = furniture.getProductSofa();
        ProductTable productTable = furniture.getProductTable();


        System.out.println("Furniture Sofa: " + productSofa.getNumberOfSeats());
        System.out.println("Furniture Table: " + productTable.getTopLayer());
    }


}
