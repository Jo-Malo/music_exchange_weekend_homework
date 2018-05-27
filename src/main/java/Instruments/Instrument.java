package Instruments;

import Enums.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements ISell, IPlay{
    private String colour;
    private String family;
    private double sellingPrice;
    private double priceBought;
    protected InstrumentType type;

    public Instrument(String colour, String family, double sellingPrice, double priceBought, InstrumentType type){
        this.colour = colour;
        this.family = family;
        this.sellingPrice = sellingPrice;
        this.priceBought = priceBought;
        this.type = type;
    }

    public String getColour() {
        return this.colour;
    }

    public String getFamily() {
        return this.family;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public double getPriceBought() {
        return this.priceBought;
    }

    public double getMarkUp() {
        return this.sellingPrice - this.priceBought;
    }

    public InstrumentType getInstrumentType() {
        return this.type;
    }
}
