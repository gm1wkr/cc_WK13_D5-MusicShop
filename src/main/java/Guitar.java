public class Guitar extends Instrument implements IPlay, ISell{

    private int numberOfStrings;


    public Guitar(String name, String model, String description, double retailPrice, double costPrice, String instrumentType, int numberOfStrings) {
        super(name, model, description, retailPrice, costPrice, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "Dwanggg";
    }

    @Override
    public double calculateMarkup() {
        return this.getRetailPrice() - this.getCostPrice();
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
