import Interfaces.ISell;

public abstract class Accessories implements ISell {
    private String description;
    private double sellingPrice;
    private double priceBought;

    public Accessories(String description, double sellingPrice, double priceBought) {
        this.description = description;
        this.sellingPrice = sellingPrice;
        this.priceBought = priceBought;
    }

    public String getDescription(){
        return this.description;
    }

    public double getSellingPrice(){
        return this.sellingPrice;
    }

    public double getPriceBought(){
        return this.priceBought;
    }

    public double getMarkUp(){
        return this.sellingPrice - this.priceBought;
    }

}
