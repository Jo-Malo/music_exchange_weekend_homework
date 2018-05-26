import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
//    private ArrayList<Accessories> stockTypes;
    private ArrayList<ISell> stockList;

    public Shop() {
//        stockTypes = new ArrayList<>();
        stockList = new ArrayList<>();
    }

//    public int getShopInventoryCount() {
//        return this.stockTypes.size();
//    }
//
//    public void addStockToShopInventoryCount(Accessories accessories) {
//        this.stockTypes.add(accessories);
//    }
//
//    public void removeStockFromShopInventory(Accessories accessories) {
//        this.stockTypes.remove(0);
//    }

    public int getIstockCount() {
        return this.stockList.size();
    }

    public void addToIstock(ISell stock) {
        this.stockList.add(stock);
    }

    public void removeStockFromIstock(Accessories accessories) {
        this.stockList.remove(0);
    }

    public void addToIstock(Instrument instrument) {
        this.stockList.add(instrument);
    }

    public int getIstockInventoryCount() {
        return this.stockList.size();
    }
}
