public abstract class Instrument extends Product implements ISell{


    String model;
    String description;

    InstrumentType productType;

    public Instrument(String name, String model, String description, double retailPrice, double costPrice, InstrumentType instrumentType) {
        super(name, retailPrice, costPrice);

        this.model = model;
        this.productType = instrumentType;
        this.description = description;
    }



    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }


    public String getProductType() {
        return this.productType.name();
    }
}
