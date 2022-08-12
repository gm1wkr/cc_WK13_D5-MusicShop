public class TinWhistle extends Instrument implements IPlay, ISell{

     private String inKeyOf;

    public TinWhistle(String name, String model, String description, double retailPrice, double costPrice, String instrumentType, String inKeyOf) {
        super(name, model, description, retailPrice, costPrice, instrumentType);
        this.inKeyOf = inKeyOf;
    }

    @Override
    public String play() {
        return "DiddleDiDiddleDo";
    }

    @Override
    public double calculateMarkup() {
        return this.getRetailPrice() - this.getCostPrice();
    }

    public String getKey() {
        return this.inKeyOf;
    }
}
