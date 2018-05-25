import java.util.ArrayList;

public class Shop {
    private ArrayList<Accessories> stockTypes;

    public Shop() {
        stockTypes = new ArrayList<>();
    }

    public int getShopInventoryCount() {
        return this.stockTypes.size();
    }

    public void addStockToShopInventoryCount(Accessories accessories) {
        this.stockTypes.add(accessories);
    }

    public void removeStockFromShopInventory(Accessories accessories) {
        this.stockTypes.remove(0);
    }
}
