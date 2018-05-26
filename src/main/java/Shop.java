import Interfaces.IStock;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Accessories> stockTypes;
    private ArrayList<IStock> stockList;

    public Shop() {
        stockTypes = new ArrayList<>();
        stockList = new ArrayList<>();
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

    public void add(IStock stock) {
        this.stockList.add(stock);
    }

    public int getIstockInventoryCount() {
        return this.stockList.size();
    }
}
