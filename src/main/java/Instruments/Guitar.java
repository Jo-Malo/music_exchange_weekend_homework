package Instruments;

import Enums.InstrumentType;
import Instruments.Instrument;
import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument implements IPlay{
    int numberOfStrings;


    public Guitar(String colour, String family, int numberOfStrings, InstrumentType type){
        super(colour, family, 150.00, 80.00, type);
        this.numberOfStrings = numberOfStrings;
    }

    public String play(String noise) {
        return "Instruments.Guitar makes a twang noise";
    }

    public void addToIstock(ISell stock) {
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public InstrumentType getInstrumentType() {
        return this.type;
    }
}
