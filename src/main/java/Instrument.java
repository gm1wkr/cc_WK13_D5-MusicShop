public abstract class Instrument {

    String name;
    String model;
    String description;
    double retailPrice;
    double costPrice;
    String instrumentType;

    public Instrument(String name, String model, String description, double retailPrice, double costPrice, String instrumentType) {
        this.name = name;
        this.model = model;
        this.description = description;
        this.retailPrice = retailPrice;
        this.costPrice = costPrice;
        this.instrumentType = instrumentType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public String getInstrumentType() {
        return instrumentType;
    }
}
