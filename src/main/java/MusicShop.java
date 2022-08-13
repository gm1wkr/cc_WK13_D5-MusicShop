import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<Product> stock = new ArrayList<>();

    public MusicShop(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getStockList() {
        return this.stock.size();
    }

    public Product getProductByName(String productToFind) {
        for(Product product : stock){
            if(product.getName() == productToFind){
                return product;
            }
        }
        return null;
    }

    public void addProductToStock(Product productToAdd) {
        stock.add(productToAdd);
    }

    public void removeProductFromStock(Product productToRemove) {
        stock.remove(productToRemove);
    }

    public double calculateProfit() {
        double profit = 0;
        for(Product product : stock){
            profit += product.calculateMarkup();
        }
        return profit;
    }
}
