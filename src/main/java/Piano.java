public class Piano extends Instrument implements IPlay, ISell{

    private int numberOfKeys;

    public Piano(String name, String model, String description, double retailPrice, double costPrice, InstrumentType instrumentType, int numberOfKeys) {
        super(name, model, description, retailPrice, costPrice, instrumentType);
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public String play() {
        return "Tinkle Tinkle";
    }

    @Override
    public double calculateMarkup() {
        return this.getRetailPrice() - this.getCostPrice();
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }


}
