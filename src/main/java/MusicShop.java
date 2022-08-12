import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> stock = new ArrayList<>();

    public MusicShop(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getStockList() {
        return this.stock.size();
    }
}
