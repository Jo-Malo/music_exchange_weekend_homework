import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stockList;

    public Shop() {
        stockList = new ArrayList<>();
    }

    public int getIstockCount() {
        return this.stockList.size();
    }

    public void addToIstock(ISell stock) {
        this.stockList.add(stock);
    }

    public void addToIstock(Instrument instrument) {
        this.stockList.add(instrument);
    }

    public void removeStockFromIstock(Accessories accessories) {
        this.stockList.remove(0);
    }
}
