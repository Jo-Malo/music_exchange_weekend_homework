package Accessories;

import Accessories.Accessories;
import Interfaces.ISell;

public class SheetMusic extends Accessories {

    public SheetMusic(String description, double sellingPrice, double priceBought) {
        super(description, sellingPrice, priceBought);
    }

    public double getMarkUp() {
        return super.getMarkUp();
    }

    public void addToIstock(ISell stock) {

    }
}
