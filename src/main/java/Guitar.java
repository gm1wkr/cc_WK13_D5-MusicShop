public class Guitar extends Instrument implements IPlay, ISell{

    private int numberOfStrings;


    public Guitar(String name, String model, String description, double retailPrice, double costPrice, InstrumentType instrumentType, int numberOfStrings) {
        super(name, model, description, retailPrice, costPrice, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "Dwanggg";
    }


    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
