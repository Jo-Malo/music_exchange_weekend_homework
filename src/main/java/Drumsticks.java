import Interfaces.ISell;

public class Drumsticks extends Accessories {

    public Drumsticks(String description, double sellingPrice, double priceBought) {
        super(description, sellingPrice, priceBought);
    }


    public double getMarkUp() {
        return super.getMarkUp();
    }

    public void addToIstock(ISell stock) {
    }

}


