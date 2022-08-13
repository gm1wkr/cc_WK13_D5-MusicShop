public class Consumable extends Product implements ISell{

    String name;
    double retailPrice;
    double costPrice;

    public Consumable(String name, double retailPrice, double costPrice) {
        super(name, retailPrice, costPrice);
        this.name = name;
        this.retailPrice = retailPrice;
        this.costPrice = costPrice;
    }


    @Override
    public double calculateMarkup() {
        return this.getRetailPrice() - this.getCostPrice();
    }
}
