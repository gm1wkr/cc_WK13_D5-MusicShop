public class Product implements ISell{
    String name;
    double retailPrice;
    double costPrice;

    public Product(String name, double retailPrice, double costPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.costPrice = costPrice;
    }

    public String getName() {
        return name;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.getRetailPrice() - this.getCostPrice();
    }
}
